package September;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DublicateWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the word : ");
		String word = input.nextLine().toLowerCase();
		String[] inputdata = word.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String words : inputdata) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}

	}

}
