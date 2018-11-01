package com.sayan.restWebservices;

import org.junit.Before;
import org.junit.Test;

import com.sayan.restWebservices.controllers.HelloWorldController;
import com.sayan.restWebservices.model.HelloWorldBean;

import junit.framework.TestCase;


public class HelloWorldTest {
	
	HelloWorldController helloWorldController;
	HelloWorldBean helloWorldBean;
	
	@Before
	public void beforetest() {
		helloWorldController= new HelloWorldController();
	}

	@Test
	public void helloWorldTest() {
		String helloWorld="Hello World";
		TestCase.assertEquals(helloWorld, helloWorldController.helloWorld());
	}
	
	@Test
	public void getMappingTest() {
		String response = "Get mapping Sameer";
		TestCase.assertEquals(response, helloWorldController.getMapping("Sameer"));
	}
	
	@Test
	public void helloWorldBeanTest() {
		helloWorldBean = new HelloWorldBean("Hello bean Sayan");
		TestCase.assertEquals(helloWorldBean.toString(), helloWorldController.helloWorldBean("Sayan").toString());
	}
	
	@Test
	public void helloWorldPathVariableTest() {
		helloWorldBean = new HelloWorldBean("Hello World Sayan");
		TestCase.assertEquals(helloWorldBean.toString(), helloWorldController.helloWorldPathVariable("Sayan").toString());
	}
	
}
