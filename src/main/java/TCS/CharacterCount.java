package TCS;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "masum";
		System.out.print("uniq character is : ");
		Map<Character, Integer> uniq = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			uniq.put(c, uniq.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : uniq.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
