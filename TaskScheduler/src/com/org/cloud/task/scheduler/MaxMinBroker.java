/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.cloud.task.scheduler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.org.cloud.utilities.TaskKeeperComparator;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Vm;

/**
 * A Broker that schedules Tasks to the VMs 
 * as per MaxMin Scheduling Policy
 * @author sanketnayak
 *
 */
public class MaxMinBroker extends DatacenterBroker  {

    
    public MaxMinBroker(String name) throws Exception {
        super(name);

    }
    
    private List<TaskKeeper> executionTime = new ArrayList<TaskKeeper>();

    //scheduling function
    public void scheduleTaskstoVms(){
        for (Cloudlet currentCloudlet : cloudletList) {
            TaskKeeper task = new TaskKeeper(vmList.size());
            task.setCloudletId(currentCloudlet.getCloudletId());
            int vmCount = 0;
            for (Vm currentVm : vmList) {
              task.getResources()[vmCount] = (float)(currentCloudlet.getCloudletLength()/currentVm.getMips()) 
                      + (currentCloudlet.getCloudletFileSize()/currentVm.getBw());
              vmCount++;
            }
            executionTime.add(task);
        }
        
        Collections.sort(executionTime, new TaskKeeperComparator());
        
        float completionTime[] = new float[vmList.size()];
        
        for(TaskKeeper currentTask : executionTime) {
            float trialcompletionTime[] = completionTime.clone();
            for (int i = 0; i < vmList.size(); i++) {
                trialcompletionTime[i] += currentTask.getResources()[i];
            }
            int index = getSmallestExecTime(trialcompletionTime);
            for(Vm thisVm : vmList){
                if(thisVm.getId() == index) {
                    bindCloudletToVm(currentTask.getCloudletId(), index);
                }
            }
            completionTime[index] =  trialcompletionTime[index];
        }
            
            
        }
    
    public int getSmallestExecTime(float execTime[]) {
        float small = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < execTime.length; i++)
            if (execTime[i] < small)
            {
                small = execTime[i];
                index = i;
            }
        return index;
        }
}
