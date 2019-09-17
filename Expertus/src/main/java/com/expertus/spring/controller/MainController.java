package com.expertus.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@RequestMapping(value="/")
	public String Home() {
		return"index";
	}
	@RequestMapping(value="/chat")
	public String chat() {
		return"chat";
	}
	@RequestMapping(value="/about")
	public String about() {
		return"about";
	}
	@RequestMapping(value="/action")
	public String action() {
		return"call-to-actions";
	}
	@RequestMapping(value="/checkout")
	public String chekout() {
		return"checkout";
	}
	@RequestMapping(value="/contact")
	public String contact() {
		return"contact-us";
	}
	@RequestMapping(value="/faq")
	public String faq() {
		return"faq";
	}
	@RequestMapping(value="/service")
	public String service() {
		return"service-single";
	}
	@RequestMapping(value="/test")
	public String test() {
		return"testimonials";
	}
	 @GetMapping("/index")
	    public String root() {
	        return "userindex";
	    }

	    @GetMapping("/login")
	    public String login(Model model) {
	        return "login";
	    }

	    @GetMapping("/user")
	    public String userIndex() {
	        return "user/index";
	    }
}
