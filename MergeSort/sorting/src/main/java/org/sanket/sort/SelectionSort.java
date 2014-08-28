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
public class SelectionSort {
    
    public static int[] selectionSort(int []a) {
        
        int min_index;
        
        for (int i = 0; i < a.length-2; i++) {
            min_index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min_index]) {
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }
        
        return a;
        
    }
}
