package com.palani.jenkin;
import java.util.logging.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
public static	org.slf4j.Logger logger=LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
public void initt() {
		logger.info("Application started-----");
	
	
}
	public static void main(String[] args) {
		logger.info("Application Executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
