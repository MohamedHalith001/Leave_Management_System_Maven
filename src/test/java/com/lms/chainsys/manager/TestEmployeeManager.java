package com.lms.chainsys.manager;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.lms.chainsys.model.Employee;
import com.lms.chainsys.service.EmployeeManager;

public class TestEmployeeManager {

	@Test
	public void testGetEmployeeList() {
		List<Employee> employeeList = EmployeeManager.getEmployeeList();
		assertEquals("Mohamed",employeeList.get(0).getName());
		assertEquals("Halith",employeeList.get(1).getName());
	}

}
