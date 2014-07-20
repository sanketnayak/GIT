/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import p1.point;


public class Spring_3 
{

    public static void main(String[] args) 
    {
        AbstractApplicationContext ac = new FileSystemXmlApplicationContext("src/one.xml");    
        
        point p1 = (point)ac.getBean("pt1");
        point p2 = (point)ac.getBean("pt2");
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
