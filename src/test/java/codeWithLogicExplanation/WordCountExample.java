package codeWithLogicExplanation;

import java.util.HashMap;

public class WordCountExample {

	public static void main(String[] args) {

		// Input sentence
		String sentence = "Interview with aditya CGO Interview";

		// Convert to lowercase and split by spaces
		String[] words = sentence.toLowerCase().split(" ");

		// HashMap to store word as key and frequency as value
		HashMap<String, Integer> wordCount = new HashMap<>();

		// Loop through each word
		for (String word : words) {
			// If word exists, increment count; otherwise start at 1
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		// Print each word and its frequency
		for (String word : wordCount.keySet()) {
			System.out.println(word + ": " + wordCount.get(word));
		}
	}
}