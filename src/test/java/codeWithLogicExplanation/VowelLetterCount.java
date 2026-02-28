package codeWithLogicExplanation;

public class VowelLetterCount {

	public static void main(String[] args) {

		// Input string
		String input = "rajuiUmbrela";

		// String containing all vowels (both uppercase and lowercase)
		String vowel = "AEIOUaeiou";

		// Counter to keep track of vowels
		int count = 0;

		// Loop through each character of the input string
		for (char c : input.toCharArray()) {

			// Check if the character exists in the vowel string
			// indexOf(c) returns -1 if the character is not found
			if (vowel.indexOf(c) != -1) {
				count++; // Increase count if vowel found
				System.out.print(c+" "); // Print the vowel character
			}
		}

		// Print total number of vowels found
		System.out.println("\ntotal number of vowels found: "+count);
	}
}