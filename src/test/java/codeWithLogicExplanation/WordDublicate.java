package codeWithLogicExplanation;

import java.util.HashSet;
import java.util.Set;

public class WordDublicate {
	public static void main(String[] args) {
		String Str = "hello ram delhi patna bihar delhi patna bihar";

		// Split the sentence into words
		String[] words = Str.split(" ");

		// HashSet to store unique words
		Set<String> uniq = new HashSet<>();

		// Add each word to the set
		for (String word : words) {
			uniq.add(word.trim()); // trim removes any accidental spaces
		}

		// Print unique words
		for (String word : uniq) {
			System.out.println(word);
		}
	}
}