package com.dictionary.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dictionary.exception.InvalidRequestException;

@ControllerAdvice
public class DictionaryControllerAdvice {
	
    @ExceptionHandler(InvalidRequestException.class)
	public ResponseEntity<Object> hadleInvalidRequestException() {
    	Map<String,String> responsBody=new HashMap<String,String>(); 
    	responsBody.put("message", "InvalidRequest");
    	return new ResponseEntity<Object>(responsBody,HttpStatus.BAD_REQUEST);
	}
}
