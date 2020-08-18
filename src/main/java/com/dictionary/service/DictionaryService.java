package com.dictionary.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dictionary.dto.DictionaryResponse;

@Service
public interface DictionaryService {
   
	public List<String> getLanguagesSupported();
	
	public DictionaryResponse getwordsStartsWith(String startsWith);
	
	public String addWord(String word);
}
