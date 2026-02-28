package codeWithLogicExplanation;

public class NonRepeatingCharacter {

	public static void main(String arg[]) {

		// Input string
		String input = "masum raza delhi bihar";
		System.out.print("non repeating character is : ");
		// Loop through each character
		for (char c : input.toCharArray()) {
			// If first and last occurrence of the character are the same,
			// it means the character appears only once in the string
			if (input.indexOf(c) == (input.lastIndexOf(c))) {
				System.out.print(c + " ");
			}
		}
		// Another string to check repeating characters
		String sc = "bittumasum";
		System.out.print("\nrepeating character is: ");
		// Loop through each character
		for (char d : sc.toCharArray()) {
			// If first and last occurrence are different,
			// it means the character appears more than once
			if (sc.indexOf(d) != (sc.lastIndexOf(d))) {
				System.out.print(d + " ");
			}
		}
	}
}