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
class HAddress {
    
    private String hStreet;
    private String hCity;

    public HAddress(String hStreet, String hCity) {
        this.hStreet = hStreet;
        this.hCity = hCity;
    }

    public HAddress() {
    }
    

    public String gethStreet() {
        return hStreet;
    }

    public void sethStreet(String hStreet) {
        this.hStreet = hStreet;
    }

    public String gethCity() {
        return hCity;
    }

    public void sethCity(String hCity) {
        this.hCity = hCity;
    }

    @Override
    public String toString() {
        return "HAddress{" + "hStreet=" + hStreet + ", hCity=" + hCity + '}';
    }
    
    
    
}
