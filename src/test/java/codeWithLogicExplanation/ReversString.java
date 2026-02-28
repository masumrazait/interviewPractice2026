package codeWithLogicExplanation;

public class ReversString {

	public static void main(String[] args) {

		String input = "delhi"; // The original string
		String rev = ""; // Variable to store the reversed string
		int len = input.length(); // Get the length of the string (5 for "delhi")

		// Loop backwards from last character to first
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i); // Append each character to rev
		}

		// Print the reversed string
		System.out.println("reverse string is : " + rev);
	}
}