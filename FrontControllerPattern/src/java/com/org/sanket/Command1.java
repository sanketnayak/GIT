package com.org.sanket;


import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sanketnayak
 */
public class Command1 implements HighCommand {

    

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response, Map<String, String> pathMap) {
        
        return pathMap.get("path1");
        
    }
    
}
