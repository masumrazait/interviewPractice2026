package Coforge;

import java.util.HashSet;
import java.util.Set;

public class WordDublicate {
	public static void main(String[] args) {
		String str = "masum raza delhi patna bihar patna amnour delhi amnour";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}
}
