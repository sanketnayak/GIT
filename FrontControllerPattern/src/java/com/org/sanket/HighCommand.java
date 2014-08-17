package com.org.sanket;


import java.util.Map;
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
public interface HighCommand {
    
    public String execute(HttpServletRequest request, HttpServletResponse response, Map<String,String> pathMap);
    
}
