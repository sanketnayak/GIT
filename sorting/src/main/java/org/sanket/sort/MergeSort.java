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
public class MergeSort {
    
    public static void  mergeSort(int[] main) {
        
        int n = main.length;
        int mid = n/2;
        
        if(main.length < 2) {
            return;
        }
        
        
        int[] l = new int[mid];
        int[] r = new int[n-mid];
        
        for (int i = 0; i < mid; i++) {
            l[i] = main[i];
        }
        for (int i = mid; i < n; i++) {
            r[i-mid] = main[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(l,r,main);
    }
    
    public static void merge(int[] l, int[] r, int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<l.length && j<r.length) {
            if (l[i]<r[j]) {
                a[k] = l[i];
                i++;
            } else
            {
                a[k] = r[j];
                j++;
            }
            k++;
        }
        
        while(i< l.length) {
            a[k] = l[i];
            k++;
            i++;
        }
        while(j< r.length) {
            a[k] = r[j];
            k++;
            j++;
        }
    }
    
}
