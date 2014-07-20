/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_4;

import org.springframework.context.*;

/**
 *
 * @author sanketnayak
 */
public class segment implements ApplicationListener
{
    private point p1;
    private point p2;
   

    @Override
    public String toString() {
        return "segment{" + "p1=" + p1 + ", p2=" + p2 + '}';
    }

    public segment() {
    }

    public segment(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public point getP1() {
        return p1;
    }

    public point getP2() {
        return p2;
    }

    public void setP1(point p1) {
        this.p1 = p1;
    }

    public void setP2(point p2) {
        this.p2 = p2;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent e) 
    {
        
        if (e instanceof spring_4.event2)
        {
            System.out.println("I am segment");
        } 
    }
    
    
    
}
