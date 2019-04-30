package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {


	private List<Student> theStudent;
	
	// define @PostConstruct to load the  student data ... only once!
	
	@PostConstruct
	public void loadData(){
	
		theStudent = new ArrayList<>();
		
		theStudent.add(new Student("Poornima", "Pate"));
		theStudent.add(new Student("Mario", "Rossi"));
		theStudent.add(new Student("Mary", "Smith"));
	}
	
	
	// define endpoint for "/students" - return list of students
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		return theStudent;
	}


	// define endoint for "/students/{studentId}" - return student at index
	

	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId)
	{
		
		// just index into the list ... keep it simple for now
		
		
		// check the studentId against list size
		if((studentId >= theStudent.size()) || (studentId < 0 )) {
			
			throw new StudentNotFoundException("Student id not found - " + studentId);
		}
		
		return theStudent.get(studentId);
		
		
	}
	

}
