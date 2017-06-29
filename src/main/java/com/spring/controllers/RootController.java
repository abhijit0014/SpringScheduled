package com.spring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@Scheduled(fixedRate=5000)
	public void home()
	{
		final Logger logger = LoggerFactory.getLogger(RootController.class);
		logger.info("working");
	}
}
