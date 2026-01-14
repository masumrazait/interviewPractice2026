package TCS;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressed {
	public static void main(String[] args) {
		String str = "aaaabbbbbggg";
		String result = "";
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
