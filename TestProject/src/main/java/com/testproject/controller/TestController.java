package com.testproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testproject.model.Employee;

@RestController
public class TestController {

	@GetMapping("/fetchdetails")
	public String fetchdetails() {
		
		return "success";
		
	}
	
	@GetMapping("/fetchempdata")
	public List<Employee> getEmployees(){
		
		List<Employee> e=new ArrayList<Employee>();
		e.add(new Employee(1,"krishna","28","krishnateja.akella@gmail.com"));
		e.add(new Employee(2,"rama","28","rama@gmail.com"));
		
		return e;
		
	}
	
}
