/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.cloud.task.scheduler;

/**
 *
 * @author sanketnayak
 */
public class TaskKeeper {
    
    private int cloudletId;
    private float resources[];
    private float overallExecutionTime = 0;
    
    public TaskKeeper(int numOfVm) {
        resources = new float[numOfVm];
    }

    public int getCloudletId() {
        return cloudletId;
    }

    public void setCloudletId(int cloudletId) {
        this.cloudletId = cloudletId;
    }

    public float[] getResources() {
        return resources;
    }

    public void setResources(float[] resources) {
        this.resources = resources;
    }

    public float getOverallExecutionTime() {
        return overallExecutionTime;
    }

    public void calculateOverallExecTime() {       
        for (int i = 0; i < resources.length; i++) {
           overallExecutionTime += resources[i];
        }
    }
    
}
