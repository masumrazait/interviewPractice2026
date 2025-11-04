package September;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence from input: ");
		String input = sc.nextLine();
		String[] word = input.split(" ");
		Set<String> uniqWord = new HashSet<>();
		for (String words : word) {
			uniqWord.add(words.trim());
		}
		for (String words : uniqWord) {
			System.out.println(words);
		}
		sc.close();
	}
}
