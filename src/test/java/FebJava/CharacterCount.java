package FebJava;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "delhipatnabihar";
		Map<Character, Integer> uniq = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			uniq.put(c, uniq.getOrDefault(c, 0) + 1);
		}
		System.out.println(uniq);
	}
}
