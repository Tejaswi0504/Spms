package com.student.Studentprojectmanagementsystem.controller;

import org.springframework.web.bind.annotation.GetMapping;




@org.springframework.stereotype.Controller

public class Controller {
	
	@GetMapping("/home")
	
	public String home() {
		 return "home";
	}

}
