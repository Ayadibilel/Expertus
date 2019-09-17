package com.expertus.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.expertus.spring.dto.UserComplaintDto;
import com.expertus.spring.model.Complaint;
import com.expertus.spring.repository.ComplaintRepository;

@Service
public class ComplaintServiceImpl  implements ComplaintService {

	 @Autowired
	    private ComplaintRepository complaintRepository;


	@Override
	public Complaint save(UserComplaintDto registration) {
		Complaint complaint = new Complaint();
		complaint.setName(registration.getName());
		complaint.setEmail(registration.getEmail());
		complaint.setSubject(registration.getSubject());
		complaint.setTextarea(registration.getTextarea());
       
        return complaintRepository.save(complaint);
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
