package Walmart;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "serah raha patna delhi delhi raxa patna amour bihar patna amour delhi masum bihar";
		String words[] = str.split(" ");
		Set<String> uniq = new LinkedHashSet<String>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}
}
