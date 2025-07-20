package com.op_solutions.data_api.exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import com.op_solutions.data_api.dtos.ErrorResponse;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptions {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	
	@ExceptionHandler(exception = ResourceNotFoundException.class)
	public ResponseEntity<ErrorResponse> handleRuntimeException(ResourceNotFoundException ex,WebRequest request)
	{
		 
		ErrorResponse error = new ErrorResponse();
	        error.setTimestamp(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	        error.setStatus(HttpStatus.NOT_FOUND.value());
	        error.setError("Not Found");
	        error.setMessage(ex.getMessage());
	        error.setPath(request.getDescription(false).replace("uri=", ""));
	        
	        HttpServletRequest httpRequest = ((ServletWebRequest) request).getRequest();
	        
	        //logger.info("Client IP Address : {} ",httpRequest.getRemoteAddr());
	        

	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	
		
	}

}
