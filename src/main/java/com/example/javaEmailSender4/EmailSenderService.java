package com.example.javaEmailSender4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {


    @Autowired
    private JavaMailSender mailSender;



    public void setEmail(String toEmail, String subject, String body){


        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom("MIkIALEX");
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(body);

        mailSender.send(mailMessage);
        System.out.println("The Mail IS Send SuccessFully!!11");



    }


}
