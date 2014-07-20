
package server1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;



public class Server1
{
   static ArrayList<PrintWriter> p = new ArrayList ();
   
   public static void main(String[] args) throws Exception
    {
        //stage 2: to create  server socket object
        System.out.println("server signing on");
        
        ServerSocket ss= new ServerSocket(9081);
        Socket soc;    
        // Socket Object
        for (int i=0 ; i<1 ; i++)
        {
            soc = ss.accept();
            conversation c = new conversation (soc);
            c.start ();
        }
       
        
        System.out.println("server signing off");
        
    }
}
