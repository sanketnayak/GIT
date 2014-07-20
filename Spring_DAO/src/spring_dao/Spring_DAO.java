/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_dao;


import java.util.ArrayList;


/**
 *
 * @author sanketnayak
 */
public class Spring_DAO 
{ 
    public static void main(String[] args) throws Exception
    {
       
        DAO<point> dao = new DAO<point> (point.class) ;
        point p1 = new point(3,5,6);
        dao.insert(p1);
        ArrayList<Object> px = dao.read();
        System.out.println(px);

    }
    
}
