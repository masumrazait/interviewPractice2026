package AccentureJan;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "CharacterCount";
		Map<Character, Integer> charco = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charco.put(c, charco.getOrDefault(c, 0) + 1);
		}
		System.out.println(charco);
	}
}
