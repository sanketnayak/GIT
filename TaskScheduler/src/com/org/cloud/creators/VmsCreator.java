package com.org.cloud.creators;
import com.org.cloud.utilities.VirtualMachine;
import java.util.ArrayList;
import java.util.List;

import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Vm;;


/**
 * VmsCreator Creates VM Lists as per the User Requirements.
 * @author sanketnayak
 *
 */
public class VmsCreator {
	
	//vmlist creator function
	public ArrayList<Vm> createRequiredVms(List<VirtualMachine> vmConfig, int brokerId){
		
            ArrayList<Vm> vmlist = new ArrayList<Vm>();
		
            //VM description
            int vmid = 0;
            long size = 10000; //image size (MB)
            int ram = 512; //vm memory (MB)
            int pesNumber = 1; //number of cpus
            String vmm = "Xen"; //VMM name

            for(VirtualMachine vm : vmConfig){

                    int mips = vm.getMips();
                    int bw = vm.getBw();
                    //add the VMs to the vmList
                    vmlist.add(new Vm(vmid, brokerId, mips, pesNumber, ram, bw, 
                                    size, vmm, new CloudletSchedulerTimeShared()));
                    vmid++;
            }

            System.out.println("\n\nVmsCreator function Executed... SUCCESS\n\n");
                    return vmlist;

            }

}