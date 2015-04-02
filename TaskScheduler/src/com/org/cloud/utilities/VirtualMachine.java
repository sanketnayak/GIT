/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.org.cloud.utilities;

/**
 *
 * @author sanketnayak
 */
public class VirtualMachine {
    
    private int mips;
    private int bw;

    public VirtualMachine(int mips, int bw) {
        this.mips = mips;
        this.bw = bw;
    }

    public int getMips() {
        return mips;
    }

    public int getBw() {
        return bw;
    }
    
    
    
}
