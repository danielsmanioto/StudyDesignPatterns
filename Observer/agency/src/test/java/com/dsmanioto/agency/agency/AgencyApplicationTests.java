package com.dsmanioto.agency.agency;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AgencyApplicationTests {
	
	@Test
	void testAgency() {
		NewsChannel observer = new NewsChannel();
		
		NewsAgency observable = new NewsAgency(observer);
		observable.setNews("news");
		
		assertEquals(observer.getNews(), "news");
	}
	
}
