package Tests;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringWin {
	public static void main(String[] args) {
		String str = "aaaaaaawwwweeeeeerrrrrggggg";
		String result = "";
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
