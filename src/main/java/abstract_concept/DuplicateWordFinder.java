package abstract_concept;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "Tata,Swift,Audi,Mercedes,Tata,Renault";
		String words[] = str.split(",");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}
}
