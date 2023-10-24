package com.example.mypack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoGitJenkinsApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(DemoGitJenkinsApplicationTests.class);

	@Test
	 contextLoads() {
		logger.info("<------------Inside context loads method----------->");
		assertEquals(true, true);
		logger.info("<------------Context loads method completed----------->");
	}

}
