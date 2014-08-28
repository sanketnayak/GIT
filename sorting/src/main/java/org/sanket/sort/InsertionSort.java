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
public class InsertionSort {
    
    public static int[] insertionSort(int []a) {
        
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            int hole = i;
            while (hole > 0 && a[hole-1] > value) {
                a[hole] = a[hole - 1];
                hole = hole - 1;               
            }
            a[hole] = value;
        }
        
        return a;
        
    }
    
}
