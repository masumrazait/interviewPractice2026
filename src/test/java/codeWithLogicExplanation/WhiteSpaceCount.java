package codeWithLogicExplanation;

public class WhiteSpaceCount {

	public static void main(String[] args) {

		// Input string with spaces
		String input = "India is  a big country";

		// Counter to keep track of spaces
		int count = 0;

		// Loop through each character in the string
		for (int i = 0; i <= input.length() - 1; i++) {

			// Check if the current character is a space
			if (input.charAt(i) == ' ') {
				count++; // Increase count if space found
			}
		}

		// Print total number of spaces
		System.out.println(count);
	}
}