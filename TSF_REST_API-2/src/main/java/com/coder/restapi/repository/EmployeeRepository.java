package com.coder.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.restapi.model.Employee;

// Used for retrieving/updating/adding/deleting data from database 

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
