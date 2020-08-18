package com.dictionary.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	public static List<String> languageMap;
	
	public static Set<String> words;
	
	static {
		languageMap=new ArrayList<String>();
		languageMap.add("Spanish");
		languageMap.add("French");
		languageMap.add("English");
		words=new HashSet<String>();
		words.add("ally");
		words.add("all");
		words.add("allbithiri");
		words.add("school");
		words.add("college");
	}
	
	public List<String> getsupportedLanguageData() {
		return languageMap;
	}
	
	public Set<String> getwords() {
		return words;
	}
	
	public void addWord(String word) {
		words.add(word);
	}
}
