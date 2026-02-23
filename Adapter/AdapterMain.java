/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterDesignPattern;

/**
 *
 * @author ISHFAA TAJ
 */
public class AdapterMain 
{
    public static void main(String[] args)
    {
        Mail mail = new Gmail();
        Notification notification = new MobileNotification();
        
        MailNotification adapter = new MailNotification(mail,notification);
        adapter.sendMail("Good Morning");
    }
}
