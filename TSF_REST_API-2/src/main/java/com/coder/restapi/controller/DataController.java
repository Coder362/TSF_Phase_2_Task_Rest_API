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

import com.coder.restapi.model.Employee;
import com.coder.restapi.repository.EmployeeRepository;


//Controls the flow of data and directs it to corresponding function
@RestController
public class DataController {
		
		@Autowired
		EmployeeRepository repo;
		
		
		// Deletes a record from the data base
		
		@DeleteMapping("/infoemployee/{employee_id}")
		public String deleteEmployee(@PathVariable int employee_id)
		{
			Employee emp= repo.getOne(employee_id);
			repo.delete(emp);
			return "deleted";
			
		}
		
		// Adds a record in the database
		
		@PostMapping("/infoemployee")
		public Employee addEmployee(@RequestBody Employee emp)
		{
			repo.save(emp);
			return emp;
		}
		
		// Updates a record in the database
		
		@PutMapping("/infoemployee")
		public Employee saveOrUpdateEmployee(@RequestBody Employee emp)
		{
			repo.save(emp);
			return emp;
		}	
		
		// Searches for all the record
		
		@GetMapping("/infoemployee")
		@ResponseBody
		public List<Employee> getEmployee()
		{
			return repo.findAll();
		}
		
		// Searches for a particular record
		
		@RequestMapping("/infoemployee/{employee_id}")
		@ResponseBody
		public Optional<Employee> getAlien(@PathVariable int employee_id)
		{
			return repo.findById(employee_id);
		}
	}
