package com.lms.chainsys.TestGetterSetter;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.lms.chainsys.model.LeaveRequest;

public class TestGetSetName {
	LeaveRequest leaveRequest = new LeaveRequest();
	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void testWithValidName() {
		String name = "Mohamed";
		leaveRequest.setName(name);
		name = leaveRequest.getName();
		assertEquals("Mohamed",name);
	}
	
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithEmptyName() {
		String name = "";
		leaveRequest.setName(name);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithSpace() {
		String name = " ";
		leaveRequest.setName(name);
	}


}
