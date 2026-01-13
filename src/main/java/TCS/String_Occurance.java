package TCS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class String_Occurance {
	public static void main(String[] args) {
		String str = "Interview with aditya CGO Interview";
		String words[] = str.split(" ");
		HashMap<String, Integer> uniq = new LinkedHashMap<String, Integer>();
		for (String word : words) {
			uniq.put(word, uniq.getOrDefault(word, 0) + 1);
		}
		for (String word : uniq.keySet()) {
			if (uniq.get(word) == 1) {
				System.out.print(word + " -> " + uniq.get(word) + " ");
			}
		}
	}
}
