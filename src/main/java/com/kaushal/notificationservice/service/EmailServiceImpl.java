package com.kaushal.notificationservice.service;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmailServiceImpl {

    @Autowired
    private final JavaMailSender mailSender;

    @KafkaListener(topics = "newaccounttopic")
    public void sendEmail(String msg) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("jskaushal292@gmail.com"); // sender's email
        message.setTo("swetashakya51@gmail.com");
        message.setSubject("Test mail");
        message.setText("I love you from coding application");

        mailSender.send(message);

        System.out.println("Email sent successfully.");
    }
}
