package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {

    @Autowired
    private JavaMailSender mailSender;

    @GetMapping("/index")
    public void index_page(){

    }
    @GetMapping("/main")
    public void main_page(){

    }

    @GetMapping("/reqmailSend")
    public String reqMailSend(String email){
        System.out.println("URL : /reqmailSend");
        System.out.println("EMAIL : "+ email);

        System.out.println(mailSender);

        String code = (int)((Math.random()*1000000))+"";

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("[WEB-Server]임시패스워드 발급");
        message.setText(code);

        mailSender.send(message);

        return "redirect:/index";

    }


}
