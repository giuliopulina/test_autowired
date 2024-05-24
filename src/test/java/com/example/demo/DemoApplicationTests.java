package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class DemoApplicationTests {

	@MockBean
	private AutowiredDependency autowiredDependency;

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {
		BeanToTest beanToTest = new BeanToTest(autowiredDependency);
		when(autowiredDependency.generate()).thenReturn("test");
		assertEquals("1test", beanToTest.doSomething());
	}

}
