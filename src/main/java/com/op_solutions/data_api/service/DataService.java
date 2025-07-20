package com.op_solutions.data_api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.op_solutions.data_api.dtos.UserRequest;
import com.op_solutions.data_api.entity.User;
import com.op_solutions.data_api.repo.UserRepo;
import com.op_solutions.data_api.util.ModelMapper;

@Service
public class DataService {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	ModelMapper mapper;
	
	
	public List<User> getAllUsersData()
	{
		
		logger.info("fetch users data in service from db");
		
		return repo.findAll(); 
	}
	
	public User getUserByUserId(Long userId)
	{
		logger.info("fetching user data from db by userid {}",userId);
		
		if(repo.findById(userId).isPresent())
		{
			return repo.findById(userId).get();
		}
		return null;
		
	}
	
	public User saveUser(UserRequest request)
	{
		User user = mapper.mapFromRequestToUser(request);
		
		if(user != null)
		{
			repo.save(user);
		}
		
		return null;
	}

}
