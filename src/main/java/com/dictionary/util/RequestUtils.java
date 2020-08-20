package com.dictionary.util;

import java.util.function.Predicate;

import com.dictionary.dto.AddWordRequest;
import com.dictionary.dto.WordRequest;

public class RequestUtils {
	
	private static Predicate<String> checkNull=value->value!=null;

	public static boolean validateWordRequest(WordRequest wordRequest) {
		return checkNull.test(wordRequest.getString());
	}
	
	public static boolean validateAddWordRequest(AddWordRequest addWordRequest) {
		return checkNull.test(addWordRequest.getWord());
	}
}
