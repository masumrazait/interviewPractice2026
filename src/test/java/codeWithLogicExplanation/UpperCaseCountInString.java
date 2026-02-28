package codeWithLogicExplanation;

public class UpperCaseCountInString {

	public static void main(String[] args) {

		// Input string to check
		String input = "MaDhUBani";

		// Counter to keep track of uppercase letters
		int count = 0;

		// Loop through each character in the string
		for (int i = 0; i <= input.length() - 1; i++) {

			// Get the character at position i
			char c = input.charAt(i);

			// Check if the character is uppercase
			if (Character.isUpperCase(c)) {
				count++; // Increase count if uppercase
				System.out.println("Upper character is : " + c);
			}
		}

		// Print total number of uppercase characters found
		System.out.println("Total Upper case is : " + count);
	}
}