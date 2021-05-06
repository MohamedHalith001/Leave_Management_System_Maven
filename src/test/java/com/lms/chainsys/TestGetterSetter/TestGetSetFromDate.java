package com.lms.chainsys.TestGetterSetter;

import static org.junit.Assert.*;

import java.time.DateTimeException;
import java.time.LocalDate;

import org.junit.Test;

import com.lms.chainsys.model.LeaveRequest;

public class TestGetSetFromDate {
	LeaveRequest leaveRequest = new LeaveRequest();
	@Test
	public void testwithValidDate() {
		String date = "2021-06-02";
		LocalDate testDate = LocalDate.parse(date);
//		LocalDate reviewDate = LocalDate.parse("2021-05-11");
		leaveRequest.setFromDate(testDate);
		assertEquals(testDate,leaveRequest.getFromDate());
//		assertEquals(reviewDate,leaveRequest.getFromDate());
	}
	@Test (expected = DateTimeException.class)
	public void testwithPastDate() {
		String date = "2020-06-02";
		LocalDate testDate = LocalDate.parse(date);
		leaveRequest.setFromDate(testDate);
	}
}
