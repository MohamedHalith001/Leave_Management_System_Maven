package com.lms.chainsys.validator;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.validator.*;
import com.lms.chainsys.model.Employee;


public class TestLoginValidator {
	Employee admin = new Employee();
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
	public void testEmployeeCheckWithValidDetailswithEmployee1() {
		admin.setUsername("moha2627");
		admin.setPassword("pass1234");
		boolean result= LoginValidator.employeeCheck(admin);
		assertEquals(true,result);
	}
	
	@Test
	public void testEmployeeCheckWithValidDetailsWithEmploee2() {
		admin.setUsername("hali2628");
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
