/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.sanket.sort;

/**
 *
 * @author sanketnayak
 */
public class BubbleSort {
    
    public static int[] bubbleSort(int []a) {
        
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }
        }
        
        return a;
    }
    
}
