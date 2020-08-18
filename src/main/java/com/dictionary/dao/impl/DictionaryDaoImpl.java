package com.dictionary.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dictionary.config.Config;
import com.dictionary.dao.DictionaryDao;
@Component
public class DictionaryDaoImpl implements DictionaryDao {
    
	@Autowired
	private Config config;
	
	@Override
	public List<String> retrieveLanguages() {
		
		return config.getsupportedLanguageData();
	}
	
	@Override
	public Set<String> retrieveWords() {
		
		return config.getwords();
	}

	@Override
	public String addWord(String word) {
		config.addWord(word);
		return "added";
	}

}
