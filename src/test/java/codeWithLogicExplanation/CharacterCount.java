package codeWithLogicExplanation;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {

		// Input string
		String str = "masum";

		// HashMap to store character as key and its count as value
		HashMap<Character, Integer> map = new HashMap<>();

		// Loop through each character in the string
		for (char c : str.toCharArray()) {
			// getOrDefault(c, 0) returns the current count if present, otherwise 0
			// Then we add 1 to update the count
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		// Print the final map showing character counts
		System.out.println(map);
	}
}