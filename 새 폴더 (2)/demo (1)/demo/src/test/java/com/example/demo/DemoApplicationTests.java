//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//
//import java.util.Properties;
//
//
//@SpringBootTest
//class DemoApplicationTests {
//	@Autowired
//	private JavaMailSender emailSender;
//	@Test
//	void contextLoads() {
//		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//		mailSender.setHost("smtp.gmail.com");
//		mailSender.setPort(587);
//		mailSender.setUsername("tydnxkdla708@gmail.com");
//		mailSender.setPassword("pkmjzauzpuiwijws");
//
//		Properties mailProps = new Properties();
//		mailProps.put("mail.smtp.auth","true");
//		mailProps.put("mail.smtp.starttls.enable","true");
//		mailSender.setJavaMailProperties(mailProps);
//
//		System.out.println(mailSender);
//		System.out.println(mailSender.getHost());
//		System.out.println(mailSender.getPort());
//
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo("sjin9574@naver.com");
//		message.setSubject("이규원");
//		message.setText("내용내용~");
//		mailSender.send(message);
//	}
//
//}
