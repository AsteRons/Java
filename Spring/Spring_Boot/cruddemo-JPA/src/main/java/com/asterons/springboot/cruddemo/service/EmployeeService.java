package com.asterons.springboot.cruddemo.service;

import java.util.List;

import com.asterons.springboot.cruddemo.entity.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
