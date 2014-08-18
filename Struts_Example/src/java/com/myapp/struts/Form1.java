/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author sanketnayak
 */
public class Form1 extends org.apache.struts.action.ActionForm {
    
    private String userName;
    
    private String pwd;;
    
    private int x;
    
    public int attempts = 0;

  

    /**
     * @return
     */
    public String getuserName() {
        return userName;
    }

    /**
     * @param string
     */
    public void setuserName(String string) {
        userName = string;
    }

    /**
     * @return
     */
    public String getpwd() {
        return pwd;
    }

    /**
     * @param i
     */
    public void setpwd(String i) {
        pwd = i;
    }

    /**
     *
     */
    public Form1() {
        super();
        
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (attempts == 0) {
            request.getSession(true).setAttribute("attempts", attempts);
            attempts++;
        }  
        if (((int) request.getSession().getAttribute("attempts")) > 2) {
             errors.add("invalidx", new ActionMessage("error.lock"));
             return errors;
        }
        String str = request.getParameter("username");
        if (str.contentEquals("tom") && request.getParameter("pwd").contentEquals("cat")) {
           
            // TODO: add 'error.name.required' key to your resources
        } else {
            int a = (int)request.getSession().getAttribute("attempts");
            a++;
            request.getSession().setAttribute("attempts", a);
             errors.add("invalidx", new ActionMessage("error.x"));
             
        }
        return errors;
    }
}
