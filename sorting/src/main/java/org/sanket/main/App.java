package org.sanket.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static org.sanket.sort.InsertionSort.insertionSort;
import static org.sanket.sort.MergeSort.mergeSort;
import static org.sanket.sort.SelectionSort.selectionSort;



/**
 * Hello world!
 *
 */
public class App 
{
     
    
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
        
        insertionSort(a);
        
        System.out.println("");
        System.out.println("");
        System.out.print("Sorted Array is : ");
        
        for (int i = 0; i < a.length; i++) { 
            System.out.print(a[i]+" ");
        }
        
        System.out.println("");
        
    }
}
