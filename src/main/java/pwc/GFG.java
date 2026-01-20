package pwc;

import java.util.HashMap;
import java.util.Map;

public class GFG {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new HashMap<String, Integer>();
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		for (String word : uniq.keySet()) {
			System.out.print(word + " -> " + uniq.get(word) + " ");
		}
	}
}
