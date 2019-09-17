package com.expertus.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expertus.spring.model.Complaint;
import com.expertus.spring.repository.ComplaintRepository;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {

	@Autowired
	ComplaintRepository complaintRepository;
	
	
	@GetMapping
    public String showRegistrationForm(Model model) {
        return "contact-us";
    }

    @PostMapping
    public String registerUserAccount(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("subject") String subject,@RequestParam("textarea") String textarea){   	
    	Complaint complaint = new Complaint();
    	complaint.setName(name);
    	complaint.setEmail(email);
    	complaint.setSubject(subject);
    	complaint.setTextarea(textarea);
    	complaintRepository.save(complaint);
        return "contact-us";
    }

}
