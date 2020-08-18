package com.dictionary.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class WordRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String String;

	public String getString() {
		return String;
	}

	public void setString(String string) {
		this.String = string;
	}
   
}
