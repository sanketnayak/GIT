/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.cloud.creators;


import com.org.cloud.utilities.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;

/**
 * CloudletCreator Creates Cloudlets as per the User Requirements.
 * @author sanketnayak
 *
 */
public class CloudletCreator {
	
	
	//cloudlet creator
	public ArrayList<Cloudlet> createUserCloudlet(List<Task> taskConfig,int brokerId){
        
        ArrayList<Cloudlet> cloudletList = new ArrayList<Cloudlet>();
		
    	//Cloudlet properties
    	int id = 0;
    	int pesNumber=1;
    	
    	
    	//long outputSize = 300;
    	UtilizationModel utilizationModel = new UtilizationModelFull();
    	   	
    	Scanner sc = new Scanner(System.in);
        
    	for(Task currentTask : taskConfig){
    		
                long length = currentTask.getMi();
                long fileSize  = currentTask.getMb();
                long outputSize = fileSize;
    		Cloudlet task = new Cloudlet(id, length, pesNumber, fileSize, outputSize, utilizationModel, utilizationModel, utilizationModel);
    		task.setUserId(brokerId);
    		
    		
    		System.out.println("Task"+id+"= mi: "+(task.getCloudletLength()) + " mb: " + (task.getCloudletFileSize()));
    		
    		//add the cloudlets to the list
        	cloudletList.add(task);
                id++;
    	}

    	System.out.println("\n\nSUCCESSFULLY Cloudletlist created \n\n");

		return cloudletList;
		
	}

}