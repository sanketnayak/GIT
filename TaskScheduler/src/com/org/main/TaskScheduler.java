

package com.org.main;

import com.org.cloud.creators.CloudletCreator;
import com.org.cloud.creators.DataCenterCreator;
import com.org.cloud.creators.VmsCreator;
import com.org.cloud.task.scheduler.MaxMinBroker;
import com.org.cloud.utilities.Task;
import com.org.cloud.utilities.VirtualMachine;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.core.CloudSim;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


/**
 * Improved MaxMin Task scheduling
 * @author sanketnayak
 */
public class TaskScheduler {

	/** The cloudlet list. */
	private static List<Cloudlet> cloudletList;

	/** The vmlist. */
	private static List<Vm> vmlist ;

        /** User Inputted Vm config **/
        private static List<VirtualMachine> vmConfig = new ArrayList<VirtualMachine>();;
        
        /** User Inputted Vm config **/
        private static List<Task> taskConfig = new ArrayList<Task>();

	
	/**
	 * Creates main() to run this example
	 */
	public static void main(String[] args) {

		Log.printLine("Starting MaxMin...\n\n");

	        try {
                        //Parsing the config xml and storing user input configurations
                        xmlParser();
                        
	        	// First step: Initialize the CloudSim package. It should be called
	            	// before creating any entities.
	            	int num_user = 1;   // number of cloud users
	            	Calendar calendar = Calendar.getInstance();
	            	boolean trace_flag = false;  // mean trace events

	            	// Initialize the CloudSim library
	            	CloudSim.init(num_user, calendar, trace_flag);

	            	// Second step: Create Datacenters
	            	@SuppressWarnings("unused")
					Datacenter datacenter0 = createDatacenter("Datacenter_0");

	            	//Third step: Create Broker
	            	MaxMinBroker broker = createBroker();
	            	int brokerId = broker.getId();
                        
                    
	            	//Fourth step: Create one virtual machine
	            	vmlist = new VmsCreator().createRequiredVms(vmConfig, brokerId);


	            	//submit vm list to the broker
	            	broker.submitVmList(vmlist);


	            	//Fifth step: Create two Cloudlets
	            	cloudletList = new CloudletCreator().createUserCloudlet(taskConfig, brokerId);
      	
	            	//submit cloudlet list to the broker
	            	broker.submitCloudletList(cloudletList);
	            	
    	
	            	//call the scheduling function via the broker
	            	broker.scheduleTaskstoVms();
   	
            	
	            	// Sixth step: Starts the simulation
	            	CloudSim.startSimulation();


	            	// Final step: Print results when simulation is over
	            	List<Cloudlet> newList = broker.getCloudletReceivedList();

	            	CloudSim.stopSimulation();

	            	printCloudletList(newList, vmlist);

	            	Log.printLine("\n\nMaxMin finished!");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	            Log.printLine("The simulation has been terminated due to an unexpected error");
	        }
	    }

		private static Datacenter createDatacenter(String name){
			Datacenter datacenter=new DataCenterCreator().createUserDatacenter(name, vmConfig.size());			

	        return datacenter;

	    }

	    /**
                Creates broker to implement maxmin algorithm
            */
	    private static MaxMinBroker createBroker(){

	    	MaxMinBroker broker = null;
	        try {
			broker = new MaxMinBroker("Broker");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
	    	return broker;
	    }

	    /**
	     * Prints the Cloudlet objects
	     * @param list  list of Cloudlets
             * @param list  list of Vms
	     */
	    private static void printCloudletList(List<Cloudlet> list, List<Vm> vmList) {
	        int size = list.size();
	        Cloudlet cloudlet;
                double execTime[] = new double[vmList.size()];
	        String indent = "    ";
	        Log.printLine();
	        Log.printLine("========== OUTPUT ==========");
	        Log.printLine("Task ID" + indent + "STATUS" + indent +
	                "Data center ID" + indent + "VM ID" + indent + indent + "Execution Time" + indent +  "Start Time" + indent + "Finish Time");

	        DecimalFormat dft = new DecimalFormat("###.##");
	        for (int i = 0; i < size; i++) {
	            cloudlet = list.get(i);
	            Log.print(indent + cloudlet.getCloudletId() + indent + indent);
                    
	            if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS){
	                Log.print("SUCCESS");
                        
	            	Log.printLine( indent + indent + cloudlet.getResourceId() + indent + indent + indent + indent + cloudlet.getVmId() +
	                     indent + indent + indent+ indent + dft.format(cloudlet.getActualCPUTime() - execTime[cloudlet.getVmId()]) + indent + indent + indent + dft.format(cloudlet.getExecStartTime())+
                             indent + indent + dft.format(cloudlet.getFinishTime()));
                        execTime[cloudlet.getVmId()] = cloudlet.getActualCPUTime();
	            }
	        }
	    }

            /**
             * Parses Config.xml to get user input configuration
             * @throws ParserConfigurationException
             * @throws SAXException
             * @throws IOException 
             */
            private static void xmlParser() throws ParserConfigurationException, SAXException, IOException {
                try {

                    File fXmlFile = new File("Resources/Config.xml");
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(fXmlFile);

                    doc.getDocumentElement().normalize();

                    System.out.println("Parsing Config.xml...........\n\n");
                    
                    NodeList vmList = doc.getElementsByTagName("Vm");

                    System.out.println("\n\nParsing Vm configuration.......\n\n");
                    for (int temp = 0; temp < vmList.getLength(); temp++) {

                        Node nNode = vmList.item(temp);


                        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNode;
                            
                            int mips = Integer.parseInt(eElement.getElementsByTagName("mips").item(0).getTextContent());
                            int bw = Integer.parseInt(eElement.getElementsByTagName("bw").item(0).getTextContent());
                            
                            VirtualMachine vm = new VirtualMachine(mips, bw);
                            vmConfig.add(vm);
                        }   
                        }
                        
                        NodeList taskList = doc.getElementsByTagName("Task");

                        System.out.println("\n\nParsing Task configuration......\n\n");
                        for (int i = 0; i < taskList.getLength(); i++) {

                        Node nNodes = taskList.item(i);

                        if (nNodes.getNodeType() == Node.ELEMENT_NODE) {

                            Element eElement = (Element) nNodes;
                            
                            int mi = Integer.parseInt(eElement.getElementsByTagName("mi").item(0).getTextContent());
                            int mb = Integer.parseInt(eElement.getElementsByTagName("mb").item(0).getTextContent());
                            
                            Task task = new Task(mi, mb);
                            taskConfig.add(task);
                            
                            }
                        }
                    
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
}