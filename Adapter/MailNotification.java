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
public class MailNotification implements Mail
{
    Mail mail;
    Notification notification;
    
    public MailNotification(Mail mail,Notification notification)
    {
        this.mail = mail;
        this.notification = notification;
    }
    @Override
    public void sendMail(String msg)
    {
        mail.sendMail(msg);
        notification.sendNotification(msg);
    }
}
