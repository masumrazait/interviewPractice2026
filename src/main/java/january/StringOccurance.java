package january;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		String str = "string delhi patna delhi bangalore bihar patna dehi patna bihar amnour dell go";
		String words[] = str.split(" ");
		Map<String, Integer> wordCount = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		for (String word : wordCount.keySet()) {
			if(wordCount.get(word)==1)
			System.out.print(word + " -> " + wordCount.get(word)+" ");
		}
	}
}
