package March;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "masum raza delhi patna bihar delhi amnour delhi patn";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.println(word);
		}
	}
}
