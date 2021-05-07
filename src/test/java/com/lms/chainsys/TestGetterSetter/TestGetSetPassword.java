package com.lms.chainsys.TestGetterSetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.User;

public class TestGetSetPassword {
	User user = new User();
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
