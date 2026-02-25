/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyDesignPattern;

/**
 *
 * @author ISHFAA TAJ
 */
public class RealInternet implements Internet
{

    @Override
    public void connectTo(String hostName) 
    {
        System.out.println("Connecting to "+ hostName);
    }   
}
