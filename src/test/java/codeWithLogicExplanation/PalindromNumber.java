package codeWithLogicExplanation;

public class PalindromNumber {

	public static void main(String[] args) {

		int num = 12321; // The number to check
		int rev = 0; // Variable to store the reversed number
		int original = num; // Keep a copy of the original number

		// Reverse the number
		while (num != 0) {
			rev = rev * 10 + num % 10; // Take last digit and build reversed number
			num = num / 10; // Remove last digit from num
		}

		// Compare original with reversed
		if (original == rev) {
			System.out.println(original + " number is palindrome");
		} else {
			System.out.println(rev + " num is not palindrome");
		}
	}
}