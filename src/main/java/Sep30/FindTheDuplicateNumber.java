package Sep30;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the words: ");
		String input = sc.nextLine();
		String word[] = input.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}
	}
}
