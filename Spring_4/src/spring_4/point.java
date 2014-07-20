/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.springframework.context.*;

/**
 *
 * @author sanketnayak
 */
public class point implements ApplicationListener<event1>
{
    private Map a;
    
    private String str;

    public point() {
    }

    
    public point(Map a, String str) {
        this.a = a;
        this.str = str;
    }

    public void setA(Map a) {
        this.a = a;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Map getA() {
        return a;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "point{" + "a=" + a + ", str=" + str + '}';
    }

    
    @Override
    public void onApplicationEvent(event1 e) {
System.out.println("On event of Point class Listener is called"); 
    }

    
    
   
}
