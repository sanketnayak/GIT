/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spring_dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;



import javax.xml.parsers.ParserConfigurationException;


import org.xml.sax.SAXException;




/**
 *
 * @author sanketnayak
 */
public class DAO <T>
{
    private static ArrayList<Object> pa = new ArrayList<Object> ();
    private static Connection conn;
    private static Statement st;
    private static Class c;
    private static Properties prop;
    private static InputStream input;
    static Logger logger = Logger.getRootLogger();
    
    static
    {
        
        try 
        {
            prop = new Properties();
            input = new FileInputStream("//Users//sanketnayak//Desktop//Spring_Framework//Spring_DAO//src//spring_dao//DAO_Config.properties");
            prop.load(input);
            conn = database_conn();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            
        }
 
    }
    
    public DAO(Class c) 
    {
        this.c = c;       
    }
    private static Connection database_conn()
   {
       try 
        {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {Logger.getLogger(DAO.class.getName()).log(Level.ERROR, null, ex);}
        try {
            conn = DriverManager.getConnection(prop.getProperty("driver"),prop.getProperty("username"),prop.getProperty("password"));
             return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.ERROR, null, ex);
        }
       
        return null;
        
   }
    
    
    public synchronized  ArrayList<Object> read() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException
    {     try
        {
            logger.info("Read started");
          ArrayList<String> col_names = new ArrayList<String>();
          ArrayList<String> col_types = new ArrayList<String>();
          
          Object obj = c.newInstance();
          
          
          Statement st = conn.createStatement();
          
          ResultSet rs = st.executeQuery("select * from "+c.getSimpleName());
          ResultSetMetaData rsmd = rs.getMetaData();
          int count = rsmd.getColumnCount();
          
          
          for(int i=1;i<=count;i++)
          {
              col_names.add(rsmd.getColumnName(i));
              col_types.add(rsmd.getColumnTypeName(i));
          }
        
          
          while(rs.next())
          {
              ArrayList<Object> data = new ArrayList<Object>  ();
              
              
              int i=0;
              for(String s : col_types)
              {
                    if(s.equalsIgnoreCase("INT"))
                    {   
                        data.add(rs.getInt(col_names.get(i)));
                        i++;
                    }
                    if(s.equalsIgnoreCase("FLOAT"))
                    {
                        data.add(rs.getFloat(col_names.get(i)));
                        i++;
                    }
                    if(s.equalsIgnoreCase("VARCHAR"))
                    {
                        data.add(rs.getString(col_names.get(i)));
                        i++;
                    }
                }
              
              pa.add((c.getConstructor(ArrayList.class).newInstance(data)));
          }
                 
          return pa;
        }finally { logger.info("Read finished");}
    
    }
    

    
   
    
    public synchronized void insert(DAO_Interface obj) throws ClassNotFoundException, SQLException, ParserConfigurationException, SAXException, IOException
    {      
        try
        {
        
            logger.info("Insert execution started");
        ArrayList<Object> data = obj.get_param();
        
        
                    
        ArrayList<String> col_names = new ArrayList<String>();
        ArrayList<String> col_types = new ArrayList<String>();
        
        conn = database_conn();
        
        PreparedStatement ps = conn.prepareStatement(prop.getProperty(c.getSimpleName()+"_update"));
        
        Statement st = conn.createStatement();
        
          ResultSet rs = st.executeQuery("select * from "+c.getSimpleName());
          ResultSetMetaData rsmd = rs.getMetaData();
          int count = rsmd.getColumnCount();
          
          
          for(int i=1;i<=count;i++)
          {
              col_names.add(rsmd.getColumnName(i));
              col_types.add(rsmd.getColumnTypeName(i));
          }
          
        while(rs.next())
        {
            if((int)data.get(0)==rs.getInt("id"))
            {
                int i=0;
              for(String s : col_types)
              {
                  if(i==0)
                  {
                      i++;
                      continue;
                  }
                    if(s.equalsIgnoreCase("INT"))
                    {   
                        ps.setInt(i, (int)data.get(i));
                        i++;
                    }
                    if(s.equalsIgnoreCase("FLOAT"))
                    {
                        ps.setFloat(i, (Float)data.get(i));
                        i++;
                    }
                    if(s.equalsIgnoreCase("VARCHAR"))
                    {
                         ps.setString(i, (String)data.get(i));
                        i++;
                    }
                }
              
              ps.setInt(data.size(), (int)data.get(0));
                
                ps.execute();
                
                return;
            }
        }      
        
        
        PreparedStatement ps1 = conn.prepareStatement(prop.getProperty(c.getSimpleName()+"_insert"));
        rs.beforeFirst();
        int i=0;
        for(String s : col_types)
        {                  
              if(s.equalsIgnoreCase("INT"))
              {   
                  ps1.setInt(i+1, (int)data.get(i));
                  i++;
              }
              if(s.equalsIgnoreCase("FLOAT"))
              {
                  ps1.setFloat(i+1, (Float)data.get(i));
                  i++;
              }
              if(s.equalsIgnoreCase("VARCHAR"))
              {
                   ps1.setString(i+1, (String)data.get(i));
                  i++;
              }
        }
        ps1.execute();
    
    }finally { logger.info("Insert finished");}
}
    


    public synchronized void delete(int id) throws SQLException
{
    Statement st = conn.createStatement();
    st.execute("delete from "+c.getSimpleName()+" where id ="+id);
}
}
