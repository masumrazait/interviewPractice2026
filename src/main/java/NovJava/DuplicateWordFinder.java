package NovJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String input = "hello is hello tata delhi patna dehi delhi tata";
		String[] word = input.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			if (words.length() > 1) {
				System.out.println(words);
			}
		}
	}

}
