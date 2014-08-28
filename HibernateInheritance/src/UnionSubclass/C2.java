/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UnionSubclass;

/**
 *
 * @author sanketnayak
 */
public class C2 extends C1 {
    
    private int c;
    private int d;

    public C2() {
    }

    public C2(int c, int d) {
        this.c = c;
        this.d = d;
    }

    public C2(int id, int a, int b, int c, int d) {
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
        return "C2{" + "id=" + id + ", a=" + a + ", b=" + b + " c=" + c + ", d=" + d + '}';
    } 
    
    
    
}
