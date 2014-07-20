
package client1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class write extends Thread
{
    Socket soc;
    int i;
    
    public write (Socket soc,int i)
    {
        this.soc = soc;
        this.i=i;
    }
    
    public void run ()
    {
        try{
            
            OutputStream out = soc.getOutputStream();            
            OutputStreamWriter osw = new OutputStreamWriter (out);
            BufferedWriter bw = new BufferedWriter (osw);
            PrintWriter pw = new PrintWriter (bw,true);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str = br.readLine ();
            
            while (!str.equals("end"))
            {
                pw.println(str);
                str = br.readLine ();
            }
            
        } catch (Exception e){}
        System.out.println("Client "+i+" signing off");
    }
}
