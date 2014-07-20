
package client1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class read extends Thread
{
    Socket soc;
    int i;
    public read (Socket soc,int i)
    {
        this.soc = soc;
        this.i=i;
    }
    
    public void run () 
    {
    try {
        //  Creating nis......
        
            InputStream in = soc.getInputStream();
            InputStreamReader isr = new InputStreamReader (in);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine ();
            
            while (!str.equals("end"))
            {
                System.out.println("Server : "+str);
                str = br.readLine ();
            }
    } catch(Exception e){}
    //System.out.println("Client "+i+" signing off");
  }
}
