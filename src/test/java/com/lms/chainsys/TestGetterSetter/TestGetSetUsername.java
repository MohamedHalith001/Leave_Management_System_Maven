package com.lms.chainsys.TestGetterSetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.User;

public class TestGetSetUsername {
	User user = new User();
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
