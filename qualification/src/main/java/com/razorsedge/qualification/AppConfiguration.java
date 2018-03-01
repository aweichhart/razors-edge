package com.razorsedge.qualification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@EnableAutoConfiguration
@Configuration
@ComponentScan
public class AppConfiguration {

	@Autowired
	private Environment env;
}
