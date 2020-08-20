package com.dictionary.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dictionary.dao.DictionaryDao;
import com.dictionary.dto.DictionaryResponse;
import com.dictionary.service.DictionaryService;
@Component
public class DictionaryServiceImpl implements DictionaryService {

@Autowired
private DictionaryDao dictionaryDao;	

@Autowired
private DictionaryResponse dictionaryResponse;

	@Override
	public List<String> getLanguagesSupported() {
		
		return dictionaryDao.retrieveLanguages();
	}

	@Override
	public DictionaryResponse getwordsStartsWith(String startsWith) {
     	Set<String> stringList=dictionaryDao.retrieveWords();
		List<String> matchedWords=stringList.stream().filter(word->word.startsWith(startsWith)).collect(Collectors.toList());
		Collections.sort(matchedWords);
		dictionaryResponse.setWords(matchedWords);
		dictionaryResponse.setCount(matchedWords.size());
		return dictionaryResponse;
	}
	
	public String addWord(String word) {
		return dictionaryDao.addWord(word);
	}

}
