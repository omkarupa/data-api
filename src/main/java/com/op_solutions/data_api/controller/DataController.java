package com.op_solutions.data_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op_solutions.data_api.entity.User;

@RestController
@RequestMapping("/api/data")
public class DataController {
	
	
	@GetMapping("/users")
	public ResponseEntity<User> getAllUsers()
	{
		return new ResponseEntity(null, HttpStatus.OK);
	}
	
	
	
	
	
	

}
