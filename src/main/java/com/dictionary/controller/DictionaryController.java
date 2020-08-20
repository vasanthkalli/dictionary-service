package com.dictionary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dictionary.dto.AddWordRequest;
import com.dictionary.dto.DictionaryResponse;
import com.dictionary.dto.WordRequest;
import com.dictionary.exception.InvalidRequestException;
import com.dictionary.service.DictionaryService;
import com.dictionary.util.RequestUtils;

@RestController(value = "/dictionary")
public class DictionaryController {
	@Autowired
	private DictionaryService dictionayService;

	
   @GetMapping(value="/languages")
	public List<String> supportedLanguages(){
	   
	   return dictionayService.getLanguagesSupported();
	}
   
   @PostMapping(value="/words/word")
  	public DictionaryResponse wordsStartsWith(@RequestBody WordRequest wordRequest){
	   boolean valid=RequestUtils.validateWordRequest(wordRequest);
	   String startsWith="";
	   if(valid) {
		   startsWith=wordRequest.getString();
		   return dictionayService.getwordsStartsWith(startsWith);
	   }else {
		   throw new InvalidRequestException("Invalid Request");
	   }
  	    
  	}
   
   @PostMapping(value="/words/word")
   public String addWordToDictionary(@RequestBody AddWordRequest addWordRequest) {
	   boolean valid=RequestUtils.validateAddWordRequest(addWordRequest);
	   String word="";
	   if(valid) {
		   word=addWordRequest.getWord();
		   return dictionayService.addWord(word);
	   }else {
		   throw new InvalidRequestException("Invalid Request");
	   }
	  
   }
   
   
}
