package AccentureJan;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccurance {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> wordC = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			wordC.put(word, wordC.getOrDefault(word, 0) + 1);
		}
		for (String word : wordC.keySet()) {
			//if(wordC.get(word)==1)
			System.out.print(word + " -> " + wordC.get(word)+" ");
		}
	}
}
