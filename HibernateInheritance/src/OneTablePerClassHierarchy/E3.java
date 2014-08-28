/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OneTablePerClassHierarchy;

import UnionSubclass.C1;

/**
 *
 * @author sanketnayak
 */
public class E3 extends E1 {
    
    private int e;
    private int f;

    public E3() {
    }

    public E3(int e, int f, int id, int a, int b) {
        super(id, a, b);
        this.e = e;
        this.f = f;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    @Override
    public String toString() {
        super.toString();
        return "E3{" + "id=" + id + ", a=" + a + ", b=" + b + " e=" + e + ", f=" + f + '}';
    }
    
    
    
    
}

