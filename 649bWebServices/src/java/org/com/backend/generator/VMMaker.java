/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.com.backend.generator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sanketnayak
 */
public class VMMaker {

    
    public static String executeCommand(String command, Runtime rt) {
 
		
 
		Process p;
		try {
			p = rt.exec(command);
			p.waitFor();
			BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(p.getInputStream()));
 
                        StringBuffer sb = new StringBuffer();
                        String line = "";			
			while ((line = reader.readLine())!= null) {
                            sb.append(line);
                            sb.append("<br>");
			}
                        return sb.toString();
		} catch (Exception e) {
			return e.getMessage();
		}
 
		
 
	}
 
}
