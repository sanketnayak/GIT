/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatemapping;

/**
 *
 * @author sanketnayak
 */
public class MobileDetails {
    
    private String name;
    private String num;

    public MobileDetails() {
    }

    public MobileDetails(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MobileDetails{" + "name=" + name + ", num=" + num + '}';
    }
    
    
}
