/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hibernate_s3e1;

/**
 *
 * @author sanketnayak
 */
public class point {
    
    private int id;
    private int x;
    private int y;

    public point(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    public point() {
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
