package September;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		String rev = "";
		int len = word.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);

		}
		System.out.println("original word is: " + word + "\n" + "reversed word is: " + rev);

	}

}
