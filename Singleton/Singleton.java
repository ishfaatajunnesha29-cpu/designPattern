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
public class Singleton 
{
    private static Singleton singleton = null;
    
    private Singleton()
    {
        System.out.println("Object Created");
    }
    
    public static Singleton getSingleton()
    {
        if(singleton==null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}
