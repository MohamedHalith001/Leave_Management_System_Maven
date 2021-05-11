package com.lms.chainsys.validator;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestDateValidator {

	@Test
	public void testwithValidDate() {
		String date = "2021-06-02";
		LocalDate testDate = LocalDate.parse(date);
		boolean invalid = DateValidator.isInvalidDate(testDate);
		assertFalse(invalid);
	}
	
	@Test
	public void testwithInvalidDate() {
		String date = "2020-06-02";
		LocalDate testDate = LocalDate.parse(date);
		boolean invalid = DateValidator.isInvalidDate(testDate);
		assertTrue(invalid);
	}
	
}
