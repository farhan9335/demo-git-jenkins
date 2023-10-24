package com.example.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoGitJenkinsApplication {

	public static Logger logger= LoggerFactory.getLogger(DemoGitJenkinsApplication.class);
	
	public static void main(String[] args) {
		logger.info("<--------------Inside main method-------------------->");
		SpringApplication.run(DemoGitJenkinsApplication.class, args);
		logger.info("<--------------Main method completed-------------------->");
	}
	
	public void beforeConstruct() {
		logger.info("<--------------Inside beforeConstruct method-------------------->");
	}

}
