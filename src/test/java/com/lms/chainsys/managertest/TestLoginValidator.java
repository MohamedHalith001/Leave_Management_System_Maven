package com.lms.chainsys.managertest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.manager.LoginValidator;
import com.lms.chainsys.model.User;

public class TestLoginValidator {
	User admin = new User();
	@Test
	public void testAdminCheckWithValidDetails() {
		admin.setUsername("hradmin");
		admin.setPassword("realadmin");
		boolean result= LoginValidator.adminCheck(admin);
		assertEquals(true,result);
	}
	
	@Test
	public void testAdminCheckWithInvalidUsername() {
		admin.setUsername("admin");
		admin.setPassword("realadmin");
		boolean result= LoginValidator.adminCheck(admin);
		assertEquals(false,result);
	}
	@Test
	public void testAdminCheckWithInvalidPassword() {
		admin.setUsername("hradmin");
		admin.setPassword("admin");
		boolean result= LoginValidator.adminCheck(admin);
		assertEquals(false,result);
	}
	
	@Test
	public void testEmployeeCheckWithValidDetails() {
		admin.setUsername("moha2627");
		admin.setPassword("pass1234");
		boolean result= LoginValidator.employeeCheck(admin);
		assertEquals(true,result);
	}
	
	@Test
	public void testEmployeeCheckWithInvalidUsername() {
		admin.setUsername("2627");
		admin.setPassword("pass1234");
		boolean result= LoginValidator.employeeCheck(admin);
		assertEquals(false,result);
	}
	
	@Test
	public void testEmployeeCheckWithInvalidPassword() {
		admin.setUsername("moha2627");
		admin.setPassword("password");
		boolean result= LoginValidator.employeeCheck(admin);
		assertEquals(false,result);
	}

}
