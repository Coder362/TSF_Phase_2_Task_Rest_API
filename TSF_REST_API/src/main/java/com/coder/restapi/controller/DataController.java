package com.coder.restapi.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.coder.restapi.model.Student;
import com.coder.restapi.repository.StudentRepository;


//Controls the flow of data and directs it to corresponding function
@RestController
public class DataController {
		
		@Autowired
		StudentRepository repo;
		
		
		// Deletes a record from the data base
		
		@DeleteMapping("/infostudent/{roll_number}")
		public String deleteStudent(@PathVariable int roll_number)
		{
			Student stud= repo.getOne(roll_number);
			repo.delete(stud);
			return "deleted";
			
		}
		
		// Adds a record in the database
		
		@PostMapping("/infostudent")
		public Student addStudent(@RequestBody Student stud)
		{
			repo.save(stud);
			return stud;
		}
		
		// Updates a record in the database
		
		@PutMapping("/infostudent")
		public Student saveOrUpdateStudent(@RequestBody Student stud)
		{
			repo.save(stud);
			return stud;
		}	
		
		// Searches for all the record
		
		@GetMapping("/infostudent")
		@ResponseBody
		public List<Student> getStudent()
		{
			return repo.findAll();
		}
		
		// Searches for a particular record
		
		@RequestMapping("/infostudent/{roll_number}")
		@ResponseBody
		public Optional<Student> getAlien(@PathVariable int roll_number)
		{
			return repo.findById(roll_number);
		}
	}
