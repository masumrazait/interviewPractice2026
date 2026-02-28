package codeWithLogicExplanation;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {

		// Integer array with some duplicate values (747 appears multiple times)
		int ar[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };

		// Input string converted to lowercase for uniform comparison
		String input = "India Delhi".toLowerCase();

		// Set to store duplicate numbers
		Set<Integer> duplicate = new HashSet<>();

		// Set to store unique numbers
		Set<Integer> uniq = new HashSet<>();

		// Loop through each number in the array
		for (int num : ar) {
			// If adding to uniq fails (already exists), add to duplicate
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}

		// Print duplicate numbers
		System.out.println("duplicate number is : " + duplicate);

		// Set to store unique characters
		Set<Character> uniqs = new HashSet<>();

		// Set to store duplicate characters
		Set<Character> duplicates = new HashSet<>();

		// Loop through each character in the string
		for (char c : input.toCharArray()) {
			// If adding to uniqs fails (already exists), add to duplicates
			if (!uniqs.add(c)) {
				duplicates.add(c);
			}
		}

		// Print duplicate characters
		System.out.println("duplicate charater is : " + duplicates);
	}
}