/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.sanket;

/**
 *
 * @author sanketnayak
 */
public class UserForm {
    
    private String username;
    private String password;

    public boolean validated ;

    public UserForm() {
    }
    
    public UserForm(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validate() {
        if (username.contentEquals("sanketn") && password.contentEquals("sanket123")) {
            validated = true;
            return true;
        }
        return false;
    }
}
