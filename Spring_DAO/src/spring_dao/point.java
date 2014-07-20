

package spring_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class point implements DAO_Interface
{
    private int id;
    private float x;
    private float y;
    

    public point() {
    }

    @Override
    public String toString() {
        return "point{" + "id=" + id + ", x=" + x + ", y=" + y + '}';
    }

    public point(int id,float x, float y) {
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public point(ArrayList<Object> data)
    {
        id=(int)data.get(0);
        x=(float) data.get(1);
        y=(float)data.get(2);
        
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getId() {
        return id;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public ArrayList<Object> get_param()
    {
        ArrayList<Object> data= new ArrayList<Object> ();
        
        data.add(id);
        data.add(x);
        data.add(y);
        
        
        return data;
    }
    
    
    
    
}
