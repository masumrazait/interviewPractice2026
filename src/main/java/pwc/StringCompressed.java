package pwc;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressed {
	public static void main(String[] args) {
		String str = "aaaaaaaaddddffff";
		String result = "";
		Map<Character, Integer> charcount = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
