/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyDesignPattern;

import java.util.Scanner;

/**
 *
 * @author ISHFAA TAJ
 */
public class ProxyMain
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Host Name : ");
        String hostName = sc.nextLine();
        
        Internet pi = new ProxyInternet();
        pi.connectTo(hostName);
    }
}
