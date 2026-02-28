package codeWithLogicExplanation;

public class ReveseSentnece {
	public static void main(String[] args) {
		// Input string where each word is reversed
		String str = "ihled si latipac fo aidnI";

		// Split the sentence into words using space as delimiter
		String words[] = str.split(" ");

		// Variable to store the final reversed sentence
		String revSen = "";

		// Loop through each word
		for (String word : words) {
			String revWord = ""; // to store reversed word
			int len = word.length();

			// Reverse the current word character by character
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}

			// Add the reversed word to the sentence
			revSen = revSen + revWord + " ";
		}

		// Print the final reversed sentence (trim removes extra space at the end)
		System.out.println(revSen.trim());
	}
}