package September;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String rev = "";
		String word = sc.nextLine();
		String orignal = word;
		int len = word.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		if (orignal.equalsIgnoreCase(rev)) {
			System.out.println("sring is palindromm: " + orignal);
		} else {
			System.out.println("string is not palindrom: " + rev);
		}

	}

}
