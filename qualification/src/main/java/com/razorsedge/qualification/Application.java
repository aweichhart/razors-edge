package com.razorsedge.qualification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.razorsedge.qualification.service.TestService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

	@Autowired
	private TestService helloService;

	public static void main(String[] args) throws Exception {

		SpringApplication app = new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);

	}

	public void run(String... args) throws Exception {

		this.helloService.doSomeTestServiceStuff();
	}
}
