/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p1;

import java.sql.*;


public class Spring_JDBC 
{ 
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_jdbc?zeroDateTimeBehavior=convertToNull","root","");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from t1");
        while(rs.next())
        {
            System.out.println(rs.getInt("c1")+"  "+rs.getInt("c2"));
        }
        }
    }
    

