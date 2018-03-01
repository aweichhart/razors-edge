package com.razorsedge.qualification;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.razorsedge.qualification.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppConfiguration.class })
@TestPropertySource("/application-test.properties")
public class TestServiceTest {

	@Autowired
	private TestService testService;

	@Test
	public void testService() {
		this.testService.doSomeTestServiceStuff();
	}
}
