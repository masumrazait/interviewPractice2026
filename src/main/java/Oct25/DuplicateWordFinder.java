package Oct25;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "tata tata raza taza taza masum masum patna";
		String[] word = str.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}
	}
}
