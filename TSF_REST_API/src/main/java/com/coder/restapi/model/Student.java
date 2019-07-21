package com.coder.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

// Student class holds and defines the property of student

@Entity							// Entity relates to a table in database
public class Student {
	@Id
	private int roll_number;	// Roll no. acts as primary key
	private long phone_no;
	private String student_name;
	private String email;
	
	// Getters and Setters
	
	public int getRoll_number() {
		return roll_number;
	}
	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number + ", phone_no=" + phone_no + ", student_name=" + student_name
				+ ", email=" + email + "]";
	}
}
