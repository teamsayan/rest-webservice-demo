package com.sayan.restWebservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.restWebservices.model.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@RequestMapping(path="/hello-world", method=RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/get-mapping")
	public String getMapping(@RequestParam("name") String name) {
		return "Get mapping "+name;
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean(@RequestParam("name") String name) {
		return new HelloWorldBean("Hello bean "+name);
	}
	
	@RequestMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}
}
