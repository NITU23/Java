package com.springproject.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args); // basically this method run
		// returns an object. context returned

		Dev obj = context.getBean(Dev.class); // from this we are injecting the dependency.
		obj.code();
	}

}
