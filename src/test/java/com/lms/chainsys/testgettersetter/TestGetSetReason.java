package com.lms.chainsys.testgettersetter;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lms.chainsys.model.LeaveRequest;

public class TestGetSetReason {
	LeaveRequest leaveRequest = new LeaveRequest();
	@Test
	public void testWithValidReason() {
		String reason = "Sick Leave";
		leaveRequest.setReason(reason);
		assertEquals("Sick Leave",leaveRequest.getReason());
//		assertEquals("Sick",leaveRequest.getReason());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testWithEmptyReason() {
		String reason = "";
		leaveRequest.setReason(reason);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testWithSpace() {
		String reason = " ";
		leaveRequest.setReason(reason);
	}
}
