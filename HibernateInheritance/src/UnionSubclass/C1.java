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
public class C1 {
    protected int id;
    protected int a;
    protected int b;

    public C1() {
    }

    public C1(int id, int a, int b) {
        this.id = id;
        this.a = a;
        this.b = b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "C1{" + "id=" + id + ", a=" + a + ", b=" + b + '}';
    }
    
    
}
