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
public class C3 extends C1 {
    
    private int e;
    private int f;

    public C3() {
    }

    public C3(int id, int a, int b, int e, int f ) {
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
        return "C3{" + "id=" + id + ", a=" + a + ", b=" + b + " e=" + e + ", f=" + f + '}';
    }
    
    
    
    
}
