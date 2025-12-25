package Accenture;

import java.util.LinkedHashMap;

public class StringOccurance {
	public static void main(String[] args) {
		String str="masumraza";
		LinkedHashMap<Character,Integer>wordCount=new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			wordCount.put(c, wordCount.getOrDefault(wordCount, 0)+1);
		}
		System.out.println(wordCount);
	}
}
