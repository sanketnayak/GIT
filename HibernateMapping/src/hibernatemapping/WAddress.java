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
public class WAddress {
    
    private String wStreet;
    private String wCity;

    public WAddress() {
    }

    public WAddress(String wStreet, String wCity) {
        this.wStreet = wStreet;
        this.wCity = wCity;
    }

    public String getwStreet() {
        return wStreet;
    }

    public void setwStreet(String wStreet) {
        this.wStreet = wStreet;
    }

    public String getwCity() {
        return wCity;
    }

    public void setwCity(String wCity) {
        this.wCity = wCity;
    }

    @Override
    public String toString() {
        return "WAddress{" + "wStreet=" + wStreet + ", wCity=" + wCity + '}';
    }
    
    
    
}
