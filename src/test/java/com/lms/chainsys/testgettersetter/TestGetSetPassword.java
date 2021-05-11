package com.lms.chainsys.testgettersetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.Employee;


public class TestGetSetPassword {
	Employee user = new Employee();
	@Test
	public void testWithValidPassword() {
		String password = "realadmin";
		user.setPassword(password);
		assertEquals(password,user.getPassword());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testWithEmptyPassword() {
		String password = "";
		user.setPassword(password);
		assertEquals(password,user.getPassword());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testWithSpace() {
		String password = " ";
		user.setPassword(password);
		assertEquals(password,user.getPassword());
	}

}
