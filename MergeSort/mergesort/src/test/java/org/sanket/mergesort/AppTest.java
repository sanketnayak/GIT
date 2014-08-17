package org.sanket.mergesort;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.verify;
import static org.sanket.mergesort.App.sort;


/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void testSort() {
        
        int []a = {5,3,6,2,7};
        int []b = {2,3,5,6,7};
        sort(a);
        
        
        
        Assert.assertArrayEquals(b, a);
        
        
        
    }
}
