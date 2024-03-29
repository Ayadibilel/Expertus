package com.expertus.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expertus.spring.model.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

}
