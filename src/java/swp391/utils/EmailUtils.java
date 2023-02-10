///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package swp391.utils;
//
//import javax.mail.PasswordAuthentication;
//import java.util.Properties;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//import swp391.domain.Email;
//
///**
// *
// * @author Chau Nhat Truong
// */
//public class EmailUtils {
//
//    public static void send(Email email) 
//            throws Exception {
//        Properties prop = new Properties();
//
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "587");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.starttls.enable", "true");
//
//        Session session = Session.getInstance(prop, new Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(email.getFrom(), email.getFromPassword());
//            }
//        });
//        try {
//
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(email.getFrom()));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email.getTo()));
//            message.setSubject(email.getSubject());
//            message.setContent(email.getContent(), "text/html; charset=utf-8");
//
//            Transport.send(message);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//
//            throw ex;
//        }
//
//    }
//}
