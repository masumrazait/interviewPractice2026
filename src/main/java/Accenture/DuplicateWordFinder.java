package Accenture;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "NAGARAJAN PATNA DELHI UP BLR DELHI BRL OPATNA PATNA";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<>();
		System.out.print("Uniq word are: ");
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}
}
