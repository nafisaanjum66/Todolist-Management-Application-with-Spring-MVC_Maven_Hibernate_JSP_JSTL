//package com.emails;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.stereotype.Service;
//
///**
// * @author Crunchify.com
// *
// */
//
//@Service("notifyEmail")
//public class NotifyEmailAPI {
//
//    @Autowired
//    private MailSender notifymail; // MailSender interface defines a strategy
//    // for sending simple mails
//
//    public void notifyReadyToSendEmail(String toAddress, String fromAddress, String subject, String msgBody) {
//
//        SimpleMailMessage notifyMsg = new SimpleMailMessage();
//        notifyMsg.setFrom(fromAddress);
//        notifyMsg.setTo(toAddress);
//        notifyMsg.setSubject(subject);
//        notifyMsg.setText(msgBody);
//        notifymail.send(notifyMsg);
//    }
//}
