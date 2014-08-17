package org.sanket.mergesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Hello world!
 *
 */
public class App 
{
     public static void  sort(int[] main) {
        
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
        sort(l);
        sort(r);
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
    
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = (new BufferedReader(new InputStreamReader(System.in)));
        
        System.out.println("Enter the number of elements in array");
        
        int length = Integer.parseInt(br.readLine());
        
        int a[] = new int[length];
        
        
        
        for (int i = 0; i < a.length; i++) {        
            System.out.println("Enter number "+(i+1));
            a[i] = Integer.parseInt(br.readLine());          
        }
        
        sort(a);
        
        System.out.println("");
        System.out.println("");
        System.out.print("Sorted Array is : ");
        
        for (int i = 0; i < a.length; i++) { 
            System.out.print(a[i]+" ");
        }
        
        System.out.println("");
        
    }
}
