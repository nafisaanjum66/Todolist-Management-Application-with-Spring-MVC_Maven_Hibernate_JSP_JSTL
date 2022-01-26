//package com.emails;
//
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * @author Crunchify.com
// *
// */
//
//public class NotifyEmailTest {
//
//    @SuppressWarnings("resource")
//    public static void main(String args[]) {
//
//        // Spring Bean file you specified in /src/main/resources folder
//        String notifyConfFile = "notify-bean.xml";
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(notifyConfFile);
//
//        // @Service("crunchifyEmail") <-- same annotation you specified in CrunchifyEmailAPI.java
//        NotifyEmailAPI notifyEmailAPI = (NotifyEmailAPI) context.getBean("notifyEmail");
//        String toAddr = "nafisaanjum2711@gmail.com";
//        String fromAddr = "nafisaanjumdana@gmail.com";
//
//        // email subject
//        String subject = "this is my mail subject";
//
//        // email body
//        String body = "this is mail body";
//        notifyEmailAPI.notifyReadyToSendEmail(toAddr, fromAddr, subject, body);
//    }
//}
