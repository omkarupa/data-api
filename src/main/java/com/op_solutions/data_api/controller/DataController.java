package com.op_solutions.data_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op_solutions.data_api.entity.User;
import com.op_solutions.data_api.service.DataService;

@RestController
@RequestMapping("/api/data")
public class DataController {
	
	@Autowired
	DataService service;
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers()
	{
		
		if(service.getAllUsersData() != null && service.getAllUsersData().size() > 0)
		{
			return new ResponseEntity(service.getAllUsersData(), HttpStatus.OK);
		}
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
		
		
	}
	
	
	
	
	
	

}
