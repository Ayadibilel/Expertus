package com.expertus.spring.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class UserComplaintDto {

	
	@NotEmpty
	private String name;

	@NotEmpty
	private String subject;

	@NotEmpty
	private String textarea;
	
	@Email
	@NotEmpty
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTextarea() {
		return textarea;
	}

	public void setTextarea(String textarea) {
		this.textarea = textarea;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
