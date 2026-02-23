/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton23_02_26;

/**
 *
 * @author ISHFAA TAJ
 */
public class SingletonMain 
{
    public static void main(String[] args)
    {
        Singleton sin = Singleton.getSingleton();
        Singleton sin1 = Singleton.getSingleton();
        
        if(sin==sin1)
        {
            System.out.println("Both the objects are same...");
        }
        else
        {
            System.out.println("Different Objects");
        }
    }
}
