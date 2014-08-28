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
public class E2 extends E1 {
    
    private int c;
    private int d;

    public E2() {
    }

    public E2(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public E2(int id, int a, int b, int c, int d) {
        super(id, a, b);
        this.c = c;
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        super.toString();
        return "E2{" + "id=" + id + ", a=" + a + ", b=" + b + " c=" + c + ", d=" + d + '}';
    } 
    
    
    
}
