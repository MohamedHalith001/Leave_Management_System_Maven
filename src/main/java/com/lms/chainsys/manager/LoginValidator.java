package com.lms.chainsys.manager;

import com.lms.chainsys.model.User;

public class LoginValidator {
	
	public static boolean adminCheck(User user) {
		boolean isadmin = false;
		if(user.getUsername().equals("hradmin") && user.getPassword().equals("realadmin")) {
			isadmin=true;
		}
		return isadmin;
	}
	
	public static boolean employeeCheck(User user) {
		boolean isemployee = false;
		if(user.getUsername().equals("moha2627") && user.getPassword().equals("pass1234")) {
			isemployee=true;
		}
		return isemployee;
	}
	
}
