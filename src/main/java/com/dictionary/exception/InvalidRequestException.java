package com.dictionary.exception;

public class InvalidRequestException extends RuntimeException{

private static final long serialVersionUID = 1L;

private String errorMessage;
 public InvalidRequestException(String errorMessage){
	 super(errorMessage);
	 this.errorMessage=errorMessage;
 }
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
 
}
