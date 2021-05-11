package com.lms.chainsys.testgettersetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.Employee;


public class TestGetSetUsername {
	Employee user = new Employee();
	@Test
	public void testWithValidUsername() {
		String username = "hradmin";
		user.setUsername(username);
		assertEquals(username,user.getUsername());
	}
	
	@Test (expected = IllegalArgumentException.class) 
	public void testWithEmptyUsername() {
		String username = "";
		user.setUsername(username);
		assertEquals(username,user.getUsername());
	}
	@Test (expected = IllegalArgumentException.class) 
	public void testWithSpace() {
		String username = " ";
		user.setUsername(username);
		assertEquals(username,user.getUsername());
	}
}
