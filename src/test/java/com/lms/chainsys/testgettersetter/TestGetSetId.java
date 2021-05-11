package com.lms.chainsys.testgettersetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.LeaveRequest;

public class TestGetSetId {
	LeaveRequest leaveRequest = new LeaveRequest();
	@Test
	public void testWithValidId() {
		int id = 2627;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
		assertEquals(2627,id);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithNegativeId() {
		
		int id = -22;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithOneDigitId() {
		
		int id = 2;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithTwoDigitId() {
		int id = 26;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithThreeDigitId() {
		int id = 265;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithMoreThanFourDigitId() {
		int id = 268493;
		leaveRequest.setId(id);
		id = leaveRequest.getId();
	}
}
