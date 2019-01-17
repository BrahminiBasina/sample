package com.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.test" })
public class TestMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(TestMain.class, args);
	}

	@RequestMapping("/test")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "/test/{id}")
	public String getUser(@PathVariable("id") String id) {
		System.out.println("Fetching User with id " + id);
		return id;
	}
}