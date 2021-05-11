package com.lms.chainsys.manager;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;

import com.lms.chainsys.model.LeaveRequest;
import com.lms.chainsys.service.LeaveRequestManager;

public class TestLeaveRequestManager {
	@Test
	public void testGetRequest() {
		List<LeaveRequest> requestList = LeaveRequestManager.getRequestList();
		assertEquals(2,requestList.size());
	}
	@Test
	public void testAddRequest() {
		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setName("Mohamed");
		leaveRequest.setId(2627);
		LocalDate fromDate = LocalDate.parse("2022-05-11");
		LocalDate toDate = LocalDate.parse("2022-05-12");
		leaveRequest.setFromDate(fromDate);
		leaveRequest.setToDate(toDate);
		leaveRequest.setReason("Sick Leave");
		LeaveRequestManager.addRequest(leaveRequest);
		
		LeaveRequest leaveRequest1 = new LeaveRequest();
		leaveRequest1.setName("Mohamed");
		leaveRequest1.setId(2627);
		fromDate = LocalDate.parse("2022-05-11");
		toDate = LocalDate.parse("2022-05-12");
		leaveRequest1.setFromDate(fromDate);
		leaveRequest1.setToDate(toDate);
		leaveRequest1.setReason("Sick Leave");
		LeaveRequestManager.addRequest(leaveRequest1);
		LeaveRequest leaveRequest2 = new LeaveRequest();
		
		
		leaveRequest2.setName("Mohamed");
		leaveRequest2.setId(2627);
		fromDate = LocalDate.parse("2022-05-11");
		toDate = LocalDate.parse("2022-05-22");
		leaveRequest2.setFromDate(fromDate);
		leaveRequest2.setToDate(toDate);
		leaveRequest2.setReason("Going away");
		LeaveRequestManager.addRequest(leaveRequest2);
		
		LeaveRequest getRequest = LeaveRequestManager.getLeaveRequest(1);
		assertEquals("Mohamed",getRequest.getName());
		assertEquals(2627,getRequest.getId());
		assertEquals(LocalDate.parse("2022-05-11"),getRequest.getFromDate());
		assertEquals(LocalDate.parse("2022-05-12"),getRequest.getToDate());
		assertEquals("Sick Leave",getRequest.getReason());
	}
	@Test 
	public void testCancelRequestWithValidIndex() {
		LeaveRequestManager.cancelRequests(2);
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testCancelRequestWithNegativeIndex() {
		LeaveRequestManager.cancelRequests(-1);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
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
		LeaveRequestManager.rejectRequest(2);
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testRejectRequestWithInvalidId() {
		LeaveRequestManager.rejectRequest(-1);
	}
}
