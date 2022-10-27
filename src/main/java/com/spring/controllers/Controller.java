package com.spring.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.classes.Student;
import com.spring.classes.StudentRepository;

@org.springframework.stereotype.Controller
public class Controller {

	 @Autowired(required=false)
	 private StudentRepository stdRepository;
	 
	 //Method to show home page
	 @GetMapping("")
	 public String index() {
		 return "login";
	 }
	 
	 //Login Method
	 @GetMapping("/login")
	 public String Login(Model model) {
		 return "programRegister";
	 }
	 
	 //Method to register page
	 @GetMapping("/register")
	 public String index(Model model) {
		 model.addAttribute("Student", new Student());
		 return "studentRegister";
	 }
	 
	@GetMapping("/programRegister")  
   	public ModelAndView getOrders(HttpServletRequest request,HttpServletResponse response, Model model) {
		System.out.println("Program Register Method Called");
		return new ModelAndView("confirmation", "model", model); 

	  }
	
	//Call repository method that will check for the username in the database then allow the user to login
	@PostMapping("/process_login")
	public String processLogin(Student student) {
		//stdRepository.findByUsername(student.getUserName());
		return "ProgramDetails";
	}
	 
	 
	 //Saving the new user
	 @PostMapping("/studentRegister")
	 public String register(Student student) {
		 stdRepository.save(student);
		 return "login";
	 }
}
