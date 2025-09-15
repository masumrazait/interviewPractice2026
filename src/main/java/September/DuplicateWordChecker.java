package September;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Tata Audi Tata Maruti Tata Dell Hp Hp";
		String[] word = input.split(" ");
		Set<String> uniqWord = new HashSet<>();
		for (String words : word) {
			uniqWord.add(words.trim());
		}
		for (String words : uniqWord) {
			System.out.println(words);
		}
	}

}
