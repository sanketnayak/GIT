/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_4;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author sanketnayak
 */
public class event1 extends ApplicationEvent
{

    public event1() 
    {
        super("event1");
        
    }
    
    public void print ()
    {
        System.out.println("Hello");
    }
}
