package com.lms.chainsys.model;

public class Employee {
	String name;
	int id;
	String username;
	String password;
	int sickLeave = 12;
	int casualLeave = 12;
	int earnLeave = 6;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty or null");
		}
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id<999||id>9999) {
			throw new IllegalArgumentException("Employee Id must be a 4-digit Positive number");
		}
		this.id = id;
	}
	public int getSickLeave() {
		return sickLeave;
	}
	public void setSickLeave(int sickLeave) {
		if(sickLeave <0 || sickLeave >3) {
			throw new IllegalArgumentException("Invalid no. of sickleaves");
		}
		this.sickLeave = sickLeave;
	}
	public int getCasualLeave() {
		return casualLeave;
	}
	public void setCasualLeave(int casualLeave) {
		if(casualLeave <0 || casualLeave >3) {
			throw new IllegalArgumentException("Invalid no. of casual leaves");
		}
		this.casualLeave = casualLeave;
	}
	public int getEarnLeave() {
		return earnLeave;
	}
	public void setEarnLeave(int earnLeave) {
		if(earnLeave <0 || earnLeave >1) {
			throw new IllegalArgumentException("Invalid no. of earn leaves");
		}
		this.earnLeave = earnLeave;
	}
	public String toString() {
		return "Employee [Name" + name + "Id" + id + "SickLeave" + sickLeave 
				+"Casual Leave" + casualLeave +"Earn Leave" + earnLeave +"]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username==null || username.trim().isEmpty()) {
			throw new IllegalArgumentException("Username cannot be empty or null");
		}
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password==null || password.trim().isEmpty()) {
			throw new IllegalArgumentException("Password cannot be empty or null");
		}
		this.password = password;
	}
}
