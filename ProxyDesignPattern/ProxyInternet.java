/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyDesignPattern;

import java.util.ArrayList;

/**
 *
 * @author ISHFAA TAJ
 */
public class ProxyInternet implements Internet
{

    ArrayList<String> al = new ArrayList<String>();
   
     ProxyInternet()
     {
         al.add("Netflix");
         al.add("Amazon");
         al.add("Hotstar");
         al.add("Facebook");
         al.add("Google");
         al.add("Whatsapp");
     }
    
    @Override
    public void connectTo(String hostName) 
    {
        if(al.contains(hostName))
        {
            System.out.println("Access Denied...");
        }
        else
        {
            RealInternet ri = new RealInternet();
            ri.connectTo(hostName);
        }
    }
    
}
