package aaASelenium;

import java.util.HashMap;
import java.util.Map;

public class UniqWOrd {
	public static void main(String[] args) {
		String str = "mumbai delhi patna delhi patna bihar delhi amnour saran bihar amnour andhra";
		String words[] = str.split(" ");
		Map<String, Integer> feq = new HashMap<String, Integer>();
		for (String word : words) {
			if (feq.containsKey(word)) {
				feq.put(word, feq.get(word) + 1);
			} else {
				feq.put(word, 1);
			}
		}
		for (String word : feq.keySet()) {
			if (feq.get(word) == 1)
				System.out.println(word + " -> " + feq.get(word));
		}
	}
}
