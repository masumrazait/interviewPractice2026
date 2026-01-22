package AccentureJan;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressed {
	public static void main(String[] args) {
		String str = "aaaaaaaadddddgggggddd";
		String result = "";
		Map<Character, Integer> comp = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			comp.put(c, comp.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : comp.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
