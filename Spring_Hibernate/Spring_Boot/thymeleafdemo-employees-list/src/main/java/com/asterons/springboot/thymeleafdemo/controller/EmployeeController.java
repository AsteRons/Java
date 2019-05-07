package com.asterons.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asterons.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		
		// create employee
		Employee empl = new Employee(1, "Leslie", "Andrews", "leslie.adrews@gmail.com");
		Employee emp2 = new Employee(2, "Tom", "Sers", "tom.rest@gmail.com");
		Employee emp3 = new Employee(3, "John", "Yeris", "john.yaris@gmail.com");
		
		// create the list
		theEmployees = new ArrayList<>();
		
		// add to the list
		theEmployees.add(empl);
		theEmployees.add(emp2);
		theEmployees.add(emp3);

	}
	
	
	
	// add mapping for "/list"
	
	@GetMapping("/list")
	public String listEmployee(Model theModel){
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
		
	}


}
