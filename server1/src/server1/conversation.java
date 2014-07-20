
package server1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;


public class conversation extends Thread
{
    Socket soc;
    String name;
    
    public conversation(Socket soc)
    {
        this.soc = soc;
        
    }
    
    public void run () 
    {
    try {
        //  Creating nis......
        
            InputStream in = soc.getInputStream();
            InputStreamReader isr = new InputStreamReader (in);
            BufferedReader nis = new BufferedReader(isr);
            
         // Creating nos......
            
            OutputStream out = soc.getOutputStream();            
            OutputStreamWriter osw = new OutputStreamWriter (out);
            BufferedWriter bw = new BufferedWriter (osw);
            PrintWriter pw = new PrintWriter (bw,true);
            pw.println("SERVER : Please Enter Your Name");
            name =  nis.readLine ();
            
            
            Server1.p.add(pw);
            String str = nis.readLine ();
            
            while (!str.equals("end"))
            {
               
                for (PrintWriter p : Server1.p)
                {
                    if(pw!=p)
                    p.println(name+" : "+str);
                }
                str = nis.readLine ();
            }
            
            //System.out.println("Client Signing Off");
                                    
         } catch (IOException ex) {}
        System.exit(0);
    }
}
