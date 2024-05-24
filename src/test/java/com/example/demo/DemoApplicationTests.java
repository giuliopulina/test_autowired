package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

	@MockBean
	private AutowiredDependency autowiredDependency;

	@Autowired
	private BeanToTest beanToTest;

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		when(autowiredDependency.generate()).thenReturn("test");
		assertEquals("1test", beanToTest.doSomething());
	}

}
