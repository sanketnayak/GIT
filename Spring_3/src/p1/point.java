
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;


public class point 
{
  private int x;
  private int y;

    public point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }

    public point() 
    {
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
    
  
}
