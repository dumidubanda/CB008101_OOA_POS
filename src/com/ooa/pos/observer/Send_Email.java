
package com.ooa.pos.observer;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class Send_Email implements LoyalCustomer {

    @Override
    public void notifyMe(Stock admin) {
        Email email = (Email) admin;
        String Email = email.getSendmail();
        final String FromEmail = "kdhfashions@gmail.com";
        final String FromEmailPassword = "cb969801";
        String Subjects = "Schhol Management System";

        Properties properties = new Properties();

        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
            {
                @Override
                protected PasswordAuthentication getPasswordAuthentication()
                {
                    return new PasswordAuthentication(FromEmail,FromEmailPassword);
                }

            });
        try{
        
         MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(FromEmail));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(Email));
                    message.setSubject(Subjects);
                    message.setText("Hi " +"!");
                    message.setText( "Add To The System. ");
                    Transport.send(message);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    
    }
       
    
    }

    

