/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_dao;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContext;
import org.apache.logging.log4j.core.async.AsyncLogger;

/**
 *
 * @author sanketnayak
 */
public class logging {
    
    
    public static void logging () {
        System.setProperty("-DLog4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        Logger logger = LogManager.getLogger("logging_aspect");
        
            
        logger.log(Level.OFF, "THis is Test");
                long end = System.currentTimeMillis();
         
        
    } 
}
