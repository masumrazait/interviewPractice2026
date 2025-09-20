package September;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordFinder1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		String[] input = word.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String words : input) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}
	}

}
