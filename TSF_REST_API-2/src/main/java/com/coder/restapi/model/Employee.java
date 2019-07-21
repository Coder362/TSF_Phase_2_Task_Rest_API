package com.coder.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity							// Entity relates to a table in database
public class Employee {
	@Id
	private int employee_id;	// Employee id acts as primary key
	private long phone_no;
	private String name;
	private String email;
	
	// Getters and Setters
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", phone_no=" + phone_no + ", name=" + name + ", email=" + email
				+ "]";
	}
}
