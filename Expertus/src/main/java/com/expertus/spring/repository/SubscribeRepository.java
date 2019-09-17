package com.expertus.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expertus.spring.model.Subscribe;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {

	
}
