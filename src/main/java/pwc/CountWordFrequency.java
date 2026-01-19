package pwc;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordFrequency {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		for (String word : wordCount.keySet()) {
			System.out.print(word + "->" + wordCount.get(word) + " ");
		}
	}
}
