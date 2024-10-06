package com.ge.global_exception_handler.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ge.global_exception_handler.customexception.UserNotFoundException;

@RestController
public class GlobalExceptionController {
	
	
	@GetMapping("/get/user")
	public ResponseEntity<Object> getData() throws UserNotFoundException {
		
		throw new UserNotFoundException("User already exists with given name");
		
	}

}
