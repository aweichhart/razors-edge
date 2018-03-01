package com.razorsedge.qualification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	private final static Logger LOGGER = LoggerFactory.getLogger(TestService.class);

	public void doSomeTestServiceStuff() {
		TestService.LOGGER.debug("debugging some service");
	}

}
