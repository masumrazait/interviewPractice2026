package codeWithLogicExplanation;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompresssed {
	public static void main(String[] args) {
		String str = "aaaaaaggggg"; // input string
		String result = "";

		// LinkedHashMap preserves insertion order
		Map<Character, Integer> charc = new LinkedHashMap<>();

		// Count frequency of each character
		for (char c : str.toCharArray()) {
			charc.put(c, charc.getOrDefault(c, 0) + 1);
		}

		// Build compressed string
		for (Map.Entry<Character, Integer> entry : charc.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}

		System.out.println(result);
	}
}