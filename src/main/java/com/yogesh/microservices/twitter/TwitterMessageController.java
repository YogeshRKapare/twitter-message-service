package com.yogesh.microservices.twitter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwitterMessageController {
	
	@Autowired
	private TwitterMessageRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/twitter-message/from/{from}")
	public Optional<TwitterMessage> retrieveExchangeValue(
			@PathVariable int from) {
		Optional<TwitterMessage> twitterMessage 
					= repository.findById(Integer.valueOf(Integer.parseInt(""+from)));
		
		if(twitterMessage ==null) {
			throw new RuntimeException
				("Unable to Find data for " + from);
		}
		
		String port = environment.getProperty("local.server.port");
		
		return twitterMessage;
		
	}

}
