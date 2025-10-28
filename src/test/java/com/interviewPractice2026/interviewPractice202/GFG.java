package com.interviewPractice2026.interviewPractice202;

import java.util.HashMap;
import java.util.Map;

public class GFG {
	public static void main(String[] args) {
		String str = "masum raza delhi patna bihar kolakata kolkata patna bihar";
		String word[] = str.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String words : word) {
			wordCount.put(words, wordCount.getOrDefault(words, 0) + 1);
		}
		for (String words : wordCount.keySet()) {
			System.out.println(words + " : " + wordCount.get(words));
		}
	}
}
