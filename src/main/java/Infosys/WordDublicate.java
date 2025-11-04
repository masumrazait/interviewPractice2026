package Infosys;

import java.util.HashSet;
import java.util.Set;

public class WordDublicate {
	public static void main(String[] args) {
		String Str = "hello ram delhi patna bihar delhi patna bihar";
		String[] words = Str.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.println(word);
		}
	}
}
