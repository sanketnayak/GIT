/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanketnayak
 */
public class employee implements DAO_Interface
{
    String name;
    int id;

    public employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public employee() {
    }
    
    public employee(ArrayList<Object> data)
    {
        name=(String)data.get(1);
        id=(int) data.get(0);
        
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "employee{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public ArrayList<Object> get_param() 
    {
        ArrayList<Object> data= new ArrayList<Object> ();
        
        data.add(id);
        data.add(name);
       
        return data;    
    }
    
    
    
}
