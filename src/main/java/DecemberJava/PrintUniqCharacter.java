package DecemberJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintUniqCharacter {
	public static void main(String[] args) {
		String str = "delhi patna bihar amnour delhi patna bihar patna bihar ap";
		String words[] = str.split(" ");
		Map<String, Integer> uniqword = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			uniqword.put(word, uniqword.getOrDefault(word, 0) + 1);
		}
		for (String word : uniqword.keySet()) {
			if (uniqword.get(word) == 1)
				System.out.println(word + " -> " + uniqword.get(word));
		}
	}
}
