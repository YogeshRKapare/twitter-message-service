package com.yogesh.microservices.twitter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TwitterMessageRepository 
	extends JpaRepository<TwitterMessage, Integer> {	
}
