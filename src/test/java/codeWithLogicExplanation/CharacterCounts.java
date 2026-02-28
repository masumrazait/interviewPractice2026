package codeWithLogicExplanation;

import java.util.HashMap;

public class CharacterCounts {
	public static void main(String[] args) {

		// Input string
		String str = "masum";

		// HashMap to store character as key and its frequency as value
		HashMap<Character, Integer> map = new HashMap<>();

		// Loop through each character in the string
		for (char c : str.toCharArray()) {

			// Check if the character already exists in the map
			if (map.containsKey(c)) {
				// If yes, increment its count
				map.put(c, map.get(c) + 1);
			} else {
				// If not, add it with initial count = 1
				map.put(c, 1);
			}
		}

		// Print the final map showing character counts
		System.out.println(map);
	}
}