package Coforge;

import java.util.HashMap;
import java.util.Map;

public class GFG {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		for (String word : wordCount.keySet()) {
			if(wordCount.get(word)==1) {
				System.out.println(word + " " + wordCount.get(word) + " ");
			}
		}
	}
}
