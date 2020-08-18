package com.dictionary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dictionary.dto.AddWordRequest;
import com.dictionary.dto.DictionaryResponse;
import com.dictionary.dto.WordRequest;
import com.dictionary.exception.InvalidRequestException;
import com.dictionary.service.DictionaryService;
import com.dictionary.util.RequestUtils;

@RestController
public class DictionaryController {
	@Autowired
	private DictionaryService dictionayService;

	
   @RequestMapping(value="/languages",method=RequestMethod.GET,produces="application/json")
	public List<String> supportedLanguages(){
	   
	   return dictionayService.getLanguagesSupported();
	}
   
   @RequestMapping(value="/matchedwords",method=RequestMethod.POST,produces="application/json")
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
   
   @RequestMapping(value="/addword",method=RequestMethod.POST,produces="application/json")
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
