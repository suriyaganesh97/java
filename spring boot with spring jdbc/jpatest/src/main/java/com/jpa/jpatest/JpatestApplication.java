package com.jpa.jpatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.Logger;
@SpringBootApplication
public class JpatestApplication {
	static Logger logger =org.apache.logging.log4j.LogManager.getLogger((JpatestApplication.class));
	public static void main(String[] args) {
		logger.debug("inside Main method");
		SpringApplication.run(JpatestApplication.class, args);
	}

}
