package com.coder.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coder.restapi.model.Student;

// Used for retrieving/updating/adding/deleting data from database 

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
