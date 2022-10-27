package com.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.classes.Student;

@ComponentScan({"com.spring.classes"})
@ComponentScan({"com.spring.controllers"})
@ComponentScan(basePackages = {"com.spring.Application"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);	
		System.out.println("Web Server is started");
	}

}
