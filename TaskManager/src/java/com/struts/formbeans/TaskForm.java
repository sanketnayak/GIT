/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.struts.formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author sanketnayak
 */
public class TaskForm extends org.apache.struts.action.ActionForm {
    
    private String userName;
    
    private String pwd;

    /**
     * @return
     */
    public String getuserName() {
        return userName;
    }

    /**
     * @param string
     */
    public void setpwd(String string) {
        pwd = string;
    }

    /**
     *
     */
    public TaskForm() {
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
        if (request.getParameter("username").contentEquals("sanketn") && request.getParameter("pwd").contentEquals("sanket123")) {
            
            // TODO: add 'error.name.required' key to your resources
        } else {
            errors.add("name", new ActionMessage("error.name.required"));
        }
        return errors;
    }
}
