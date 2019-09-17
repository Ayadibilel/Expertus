package com.expertus.spring.controller;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expertus.spring.model.Subscribe;
import com.expertus.spring.repository.SubscribeRepository;

@Controller
public class EmailController {

	 // For sending a welcome mail to nesletter subscribers and to add them to the database
	
	@Autowired
    private JavaMailSender sender;
	@Autowired
	SubscribeRepository subscribeRepository;
   
    @RequestMapping("/newsletter")
    private String sendEmail( @RequestParam("subcribe") String email) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
         
        helper.setTo(email);
        helper.setText("How are you? welcome aboard to our online community ");
        helper.setSubject("Welcome to our Newsletter");
        sender.send(message);
        Subscribe subscribe = new Subscribe();
      
        subscribe.setEmail(email);
        subscribeRepository.save(subscribe);     
        return "contact-us";
    }
}
