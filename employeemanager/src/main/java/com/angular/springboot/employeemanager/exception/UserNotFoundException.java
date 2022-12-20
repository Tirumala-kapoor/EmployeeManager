package com.angular.springboot.employeemanager.exception;

/**
 * 
 * @author Tirumala
 *
 */
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}

}
