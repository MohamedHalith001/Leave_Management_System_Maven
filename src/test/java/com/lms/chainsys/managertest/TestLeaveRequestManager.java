package com.lms.chainsys.managertest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;

import com.lms.chainsys.manager.LeaveRequestManager;
import com.lms.chainsys.model.LeaveRequest;

public class TestLeaveRequestManager {
	@Test
	public void testGetRequest() {
		ArrayList<LeaveRequest> requestList = LeaveRequestManager.getRequestList();
		assertEquals(2,requestList.size());
	}
	@Test
	public void testAddRequest() {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setName("Mohamed");
		leaveRequest.setId(2627);
		LocalDate fromDate = LocalDate.parse("2021-05-11");
		LocalDate toDate = LocalDate.parse("2021-05-12");
		leaveRequest.setFromDate(fromDate);
		leaveRequest.setToDate(toDate);
		leaveRequest.setReason("Sick Leave");
		LeaveRequestManager.addRequest(leaveRequest);
		LeaveRequest leaveRequest1 = new LeaveRequest();
		leaveRequest1.setName("Mohamed");
		leaveRequest1.setId(2627);
		fromDate = LocalDate.parse("2021-05-11");
		toDate = LocalDate.parse("2021-05-12");
		leaveRequest1.setFromDate(fromDate);
		leaveRequest1.setToDate(toDate);
		leaveRequest1.setReason("Sick Leave");
		LeaveRequestManager.addRequest(leaveRequest1);
		LeaveRequest leaveRequest2 = new LeaveRequest();
		leaveRequest2.setName("Mohamed");
		leaveRequest2.setId(2627);
		fromDate = LocalDate.parse("2021-05-11");
		toDate = LocalDate.parse("2021-05-12");
		leaveRequest2.setFromDate(fromDate);
		leaveRequest2.setToDate(toDate);
		leaveRequest2.setReason("Sick Leave");
		LeaveRequestManager.addRequest(leaveRequest2);
		ArrayList<LeaveRequest> requestList = LeaveRequestManager.getRequestList();
		assertEquals("Mohamed",requestList.get(0).getName());
		assertEquals(2627,requestList.get(0).getId());
		assertEquals(LocalDate.parse("2021-05-11"),requestList.get(0).getFromDate());
		assertEquals(LocalDate.parse("2021-05-12"),requestList.get(0).getToDate());
		assertEquals("Sick Leave",requestList.get(0).getReason());
	}
	@Test 
	public void testCancelRequestWithValidIndex() {
		LeaveRequestManager.cancelRequests(2);
	}
	
	@Test (expected = IndexOutOfBoundsException.class)
	public void testCancelRequestWithNegativeIndex() {
		LeaveRequestManager.cancelRequests(-1);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testCancelRequestWithOutOfBoundIndex() {
		LeaveRequestManager.cancelRequests(4);
	}
	@Test
	public void testDisplayRequest() {
		LeaveRequestManager.displayRequests();
	}
	@Test 
	public void testApproveRequestWithValidId() {
		LeaveRequestManager.approveRequest(1);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testApproveRequestWithInvalidId() {
		LeaveRequestManager.approveRequest(-1);
	}
	@Test
	public void testRejectRequestWithValidId() {
		LeaveRequestManager.rejectRequest(3);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testRejectRequestWithInvalidId() {
		LeaveRequestManager.rejectRequest(-1);
	}
}
