package com.dictionary.dao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;
@Repository
public interface DictionaryDao {

	public List<String> retrieveLanguages();
	
	public Set<String> retrieveWords();
	
	public String addWord(String word);
}
