package com.dictionary.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author 829960
 *
 */
@Component
public class DictionaryResponse implements Serializable{

	/**
	 * Dictionary Response will have words along with count
	 */
	
	private static final long serialVersionUID = 1L;

	private int count;
	
	private List<String> words;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<String> getWords() {
		return words;
	}

	public void setWords(List<String> words) {
		this.words = words;
	}
	
}
