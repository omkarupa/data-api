package com.op_solutions.data_api;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.op_solutions.data_api.util.DateUtil;

import ch.qos.logback.classic.pattern.Util;

@SpringBootApplication
public class DataApiApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(DataApiApplication.class, args);
		
		
	}

}
