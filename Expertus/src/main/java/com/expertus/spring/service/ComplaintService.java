package com.expertus.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.expertus.spring.dto.UserComplaintDto;
import com.expertus.spring.model.Complaint;

public interface ComplaintService extends UserDetailsService {


	Complaint save(UserComplaintDto registration);
}
