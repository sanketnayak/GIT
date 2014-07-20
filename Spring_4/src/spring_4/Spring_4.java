/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_4;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author sanketnayak
 */
public class Spring_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractApplicationContext ac = new FileSystemXmlApplicationContext("/src/spring_4/one.xml");
        
        point p = (point)ac.getBean("pt1");
        segment s = (segment)ac.getBean("seg1");
        
        event1 e1 = new event1();  
        
        ac.publishEvent(e1);
        
        event2 e2 = new event2();  
        
        ac.publishEvent(e2);
        
        //System.out.println(p);
        
        // TODO code application logic here
    }
    
}
