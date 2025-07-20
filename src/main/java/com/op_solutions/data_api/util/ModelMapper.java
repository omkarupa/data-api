package com.op_solutions.data_api.util;

import org.springframework.stereotype.Component;

import com.op_solutions.data_api.dtos.UserRequest;
import com.op_solutions.data_api.entity.User;

@Component
public class ModelMapper {
	
	
	public User mapFromRequestToUser(UserRequest request)
	{
		if(request != null)
		{
			if(request.getFirstName() != null && request.getLastName() != null)
			{
				User user = new User();
				user.setFirstName(request.getFirstName());
				user.setLastName(request.getLastName());
				return user;
			}
		}
		return null;
	}
	

}
