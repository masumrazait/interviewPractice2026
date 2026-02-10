package Walmart;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurenceDublicate {
	public static void main(String[] args) {
		String str = "serah raha patna delhi delhi raxa patna amour bihar patna amour delhi masum bihar";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		for (String word : uniq.keySet()) {
			if (uniq.get(word) == 1)
				System.out.print(word + " -> " + uniq.get(word) + " ");
		}
	}
}
