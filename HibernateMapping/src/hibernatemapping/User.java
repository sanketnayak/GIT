/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernatemapping;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author sanketnayak
 */
public class User {
    private int uid;
    private String name;
    private String sname;
    private HAddress hAdd;
    private WAddress wAdd;
    private Set<MobileDetails> nums = new HashSet<MobileDetails>();

    public User() {
    }

    public User(int uid, String name, String sname, HAddress hAdd, WAddress wAdd, MobileDetails... args) {
        this.uid = uid;
        this.name = name;
        this.sname = sname;
        this.hAdd = hAdd;
        this.wAdd = wAdd;     
        for(MobileDetails num : args ) {
            nums.add(num);
        }
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public HAddress gethAdd() {
        return hAdd;
    }

    public void sethAdd(HAddress hAdd) {
        this.hAdd = hAdd;
    }

    public WAddress getwAdd() {
        return wAdd;
    }

    public void setwAdd(WAddress wAdd) {
        this.wAdd = wAdd;
    }

    @Override
    public String toString() {
        return "User{" + "uid=" + uid + ", name=" + name + ", sname=" + sname + ", hAdd=" + hAdd + ", wAdd=" + wAdd + ", nums=" + nums + '}';
    }

   

    public Set<MobileDetails> getNums() {
        return nums;
    }

    public void setNums(Set<MobileDetails> nums) {
        this.nums = nums;
    }
    
    
    
    
}
