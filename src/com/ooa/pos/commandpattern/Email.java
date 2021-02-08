package com.ooa.pos.commandpattern;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class Email {

    public void sendEmail() {
        final String FromEmail = "kdhfashions@gmail.com";
        final String FromEmailPassword = "cb969801";
        String Subjects = "KDH Fashions";

        Properties properties = new Properties();

        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FromEmail, FromEmailPassword);
            }

        });

        try {
            //----Email------------------------------------------------------------------------------------------------//

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(Mail));
            message.setSubject(Subjects);

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();
            String htmlText = "<H1>Hello</H1> <H2>We are so excited that you have decided to join with us. Contact us at 081 2 818181 if you have any questions.</H2><img src=\"cid:image\">";

            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();

            String filename = "C:\\Users\\Dumidu Bandara\\Documents\\NetBeansProjects\\ESA_FINAL_CB008101_CB008096_CB008098\\src\\com\\kdhfashions\\images\\welcome_image.jpg";
            DataSource fds = new FileDataSource(filename);

            /*DataSource fds = new FileDataSource(
                        "/com.kdhfashions.images/welcome_image.jpg");
             */
            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
