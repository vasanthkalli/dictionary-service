package com.dictionary.util;

import com.dictionary.dto.AddWordRequest;
import com.dictionary.dto.WordRequest;

public class RequestUtils {

	public static boolean validateWordRequest(WordRequest wordRequest) {
		return wordRequest.getString()==null ?false:true;
	}
	
	public static boolean validateAddWordRequest(AddWordRequest addWordRequest) {
		return addWordRequest.getWord()==null ?false:true;
	}
}
