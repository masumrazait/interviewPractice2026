package September;

import java.util.*;

public class Palindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		String rev = "";
		String orignal = word;
		int len = word.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}
		if (orignal.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrom: " + orignal);
		} else {
			System.out.println("String is not palindrom: " + rev);
		}
	}

}
