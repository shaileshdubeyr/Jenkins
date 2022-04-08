package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApp {
public static Logger logger = LoggerFactory.getLogger(JenkinsApp.class);
	public static void main(String[] args) {
		logger.info("show the bulid with jenkis");
		SpringApplication.run(JenkinsApp.class, args);
		System.out.println("hello");
	}

}
