/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.cloud.utilities;

import com.org.cloud.task.scheduler.TaskKeeper;
import java.util.Comparator;

/**
 *
 * @author sanketnayak
 */
public class TaskKeeperComparator implements Comparator<TaskKeeper>{

    @Override
    public int compare(TaskKeeper o1, TaskKeeper o2) {
        float execTime1 = 0;
        float execTime2 = 0;
        
        for (int i = 0; i < o1.getResources().length; i++) {
            execTime1 += o1.getResources()[i];
            execTime2 += o2.getResources()[i];
        }
        
        if (execTime1 > execTime2) {
            return -1;
        } else if (execTime1 < execTime2) {
            return 1;
        }
        return 0;
    }
}
    

