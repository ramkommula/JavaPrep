package com.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Long> getProduct(@PathVariable String id)
//	{
//		Long getproduct = employeeService.getProduct(id);
//		return new ResponseEntity(getproduct, HttpStatus.OK);
//	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/home1")
	public String home1()
	{
		return "home1";
	}
	
	@GetMapping("/home2")
	public String home2()
	{
		return "home2";
	}

}
