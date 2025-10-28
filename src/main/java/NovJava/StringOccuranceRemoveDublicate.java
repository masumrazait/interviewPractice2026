package NovJava;

import java.util.HashMap;
import java.util.Map;

public class StringOccuranceRemoveDublicate {
	public static void main(String[] args) {
		String str = "Write your code in this editor and press Run and Debug java program Write your code in this editor and press Write your code in this editor and press";
		String word[] = str.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String words : word) {
			wordCount.put(words, wordCount.getOrDefault(words, 0) + 1);
		}
		for (String words : wordCount.keySet()) {
			if (wordCount.get(words) == 1) {
				System.out.println(words + " = " + wordCount.get(words));
			}
		}
	}
}
