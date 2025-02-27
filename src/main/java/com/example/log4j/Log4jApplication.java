package com.example.log4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpringBootApplication
public class Log4jApplication implements ApplicationRunner {

	private static final Logger logger = LogManager.getLogger(Log4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
	}

	@Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        logger.info("Hello from log4j");
    }

}
