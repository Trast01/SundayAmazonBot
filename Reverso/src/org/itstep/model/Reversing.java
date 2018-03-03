package org.itstep.model;



public class Reversing {
	
	public String reverseText (String text) 
	{
		return new StringBuilder(text).reverse().toString();
	}
	
	public String numericDelimiter (String text)
	{
		if (text.contains(" ")) {
		String[] words = text.split("\\d+");
		String reversedNames = "";
		for (int i = (words.length - 1); i >= 0; i--) {
			reversedNames += words[i] + " ";
		}
		return reversedNames.trim();
	}
	return text;
	}
}
	

