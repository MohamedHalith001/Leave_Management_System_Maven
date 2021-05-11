package com.lms.chainsys.validator;

import java.util.ArrayList;
import java.util.List;

import com.lms.chainsys.model.Employee;
import com.lms.chainsys.service.EmployeeManager;

public class LoginValidator {
	/**
	 * verifies the input for the admin.
	 * @param user
	 * @return
	 */
	public static boolean adminCheck(Employee user) {
		boolean isadmin = false;
		if(user.getUsername().equals("hradmin") && user.getPassword().equals("realadmin")) {
			isadmin=true;
		}
		return isadmin;
	}
	/**
	 * verifies the input with the credentials of the employee
	 * @param user
	 * @return boolean
	 */
	
	public static boolean employeeCheck(Employee user) {
		boolean isemployee = false;
		List<Employee> employeeList = EmployeeManager.getEmployeeList();
		for (Employee employee : employeeList) {
			String username = employee.getUsername();
			String password = employee.getPassword();
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				isemployee = true;
				break;
			}
		}
		return isemployee;
	}
	
}
