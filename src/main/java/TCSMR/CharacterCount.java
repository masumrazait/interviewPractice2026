package TCSMR;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Map<Character, Integer> uniq = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			uniq.put(c, uniq.getOrDefault(c, 0) + 1);
		}
		System.out.print(uniq);
	}
}
