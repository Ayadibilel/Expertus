package com.expertus.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.expertus.spring.dto.UserComplaintDto;
import com.expertus.spring.service.ComplaintService;

@Controller
@RequestMapping("/complaint")
public class ComplaintController {

	@Autowired
	ComplaintService complaintService;
	
	@ModelAttribute("complaint")
    public UserComplaintDto userComplaintDto() {
        return new UserComplaintDto();
    }
	@GetMapping
    public String showRegistrationForm(Model model) {
        return "contact-us";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("complaint") @Valid UserComplaintDto userDto){
    	complaintService.save(userDto);
        return "redirect:/contact-us?success";
    }

}
