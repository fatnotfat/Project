/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.utils;

import swp391.customer.CustomerForgotPassword;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

    //generate vrification code
    public String getRandom() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }

    //send email to the user email
    public boolean sendEmail(CustomerForgotPassword customer) {
        boolean test = false;
        String toEmail = customer.getEmail();
        String fromEmail = "phatntse160374@fpt.edu.vn";
        String password = "aicanmatkhaulienhetui";
        //Use email does not 2-layer security registration
        try {
            // your host email smtp server details
            Properties pr = new Properties();
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.put("mail.smtp.port", "587");
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.ssl.protocols", "TLSv1.2");
            pr.put("mail.smtp.starttls.enable", "true");
            //get session to authenticate the host email address and password
            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });
            //set email message details
            Message mess = new MimeMessage(session);
            //set from email address
            mess.setFrom(new InternetAddress(fromEmail));
            //set to email address or destination email address
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            //set email subject
            mess.setSubject("User Email Verification");
            //set message text
            mess.setText("Registered successfully. Please verify your account using this code: " + customer.getCode());
            //send the message
            Transport.send(mess);
            test = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return test;
    }
}
