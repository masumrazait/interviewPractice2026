package codeWithLogicExplanation;

public class ExpandString {
	public static void main(String[] args) {
		String str = "a2b3c4"; // input string with characters followed by numbers
		String result = ""; // final expanded string

		// Loop through the string in steps of 2 (character + digit)
		for (int i = 0; i < str.length(); i += 2) {
			char ch = str.charAt(i); // the character
			int count = Character.getNumericValue(str.charAt(i + 1)); // the number after character

			// Repeat the character 'count' times
			for (int j = 1; j <= count; j++) {
				result = result + ch;
			}
		}

		// Print the expanded string
		System.out.println(result);
	}
}