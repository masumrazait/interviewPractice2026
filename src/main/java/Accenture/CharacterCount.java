package Accenture;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "masum";
		Map<Character, Integer> wordCount = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
		}
		System.out.println(wordCount);
	}
}
