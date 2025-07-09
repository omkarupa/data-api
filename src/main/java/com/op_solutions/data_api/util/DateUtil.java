package com.op_solutions.data_api.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

import org.springframework.stereotype.Component;


public class DateUtil {

	
	public static int calculateAge(LocalDate birthDate)
	{
		LocalDate currentDate = LocalDate.now();
		
		Period age = Period.between(birthDate, currentDate);
		
		System.out.println(age.getYears());
		
		return age.getYears();
	}
	
}
