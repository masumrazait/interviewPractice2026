package November;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesOfEachString {
	public static void main(String[] args) {
		String str = "delhi patna bihar amnour delhi matna matna patna delhi amnour bihar amnour saran";
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
