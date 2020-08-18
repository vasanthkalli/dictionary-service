package com.dictionary.dto;

import java.io.Serializable;

public class AddWordRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	private String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
}
