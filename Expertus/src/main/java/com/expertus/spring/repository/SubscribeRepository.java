package com.expertus.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.expertus.spring.model.Subscribe;

public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {

	public Subscribe findByEmail(String email);
}
