package codeWithLogicExplanation;

public class WhiteSpaceAndWordCount {
	public static void main(String[] args) {
		String str = "hell      aa ad ddsa ddd dd";

		// Count spaces
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("Total white space count is : " + count);

		// Count words
		int wordCount = 0;
		for (int j = 0; j <= str.length() - 2; j++) { // avoid index out of bounds
			// If current char is space AND next char is not space,
			// it means a word has ended
			if (str.charAt(j) == ' ' && str.charAt(j + 1) != ' ') {
				wordCount++;
			}
		}

		// Add 1 to count the first word (since loop only counts transitions)
		wordCount++;

		System.out.println("Total word Count is : " + wordCount);
	}
}