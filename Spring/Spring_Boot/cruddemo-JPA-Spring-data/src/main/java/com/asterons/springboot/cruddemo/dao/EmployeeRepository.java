package com.asterons.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.asterons.springboot.cruddemo.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
}

