/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_dao;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author sanketnayak
 */
public class log4jlogging {
    
     public static void logging () {
        Logger logger = Logger.getRootLogger();
         
         
                logger.log(Level.OFF, "THis is Test");
                
                
         
    } 
    
}
