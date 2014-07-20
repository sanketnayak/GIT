/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import java.io.*;
import java.net.Socket;
import javax.swing.*;


public class Client1 
{

    public static void main(String[] args) throws Exception
            
    {
        
        System.out.println("client signing on");
        Socket soc;
        
        for (int i = 0; i < 1; i++) 
        {
        try
        {
            
            System.out.println("Welcome to Client : "+i);
            soc = new Socket("127.0.0.1", 9081);
            System.out.println("client "+i+" signing on");
            read r = new read(soc,i);
            r.start ();
            write w = new write(soc,i);
            w.start();
            
        }catch(Exception e){}
        }
    }
}
