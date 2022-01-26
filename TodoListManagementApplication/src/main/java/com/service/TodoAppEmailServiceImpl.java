package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class TodoAppEmailServiceImpl implements TodoAppEmailService{

    @Autowired
    private JavaMailSender javaMailSenderImpl;

    @Override
    public void sendEmail(String username,String userEmail,String result){

        SimpleMailMessage newEmail = new SimpleMailMessage();
        newEmail.setTo(userEmail);
        newEmail.setSubject("From Todo Application");
        newEmail.setText("Hi " + username + " Someone has logged in to your account ...."+result);

        javaMailSenderImpl.send(newEmail);

    }
}
