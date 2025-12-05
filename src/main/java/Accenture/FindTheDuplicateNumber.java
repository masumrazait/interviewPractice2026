package Accenture;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		String str = "saqib,arham,delhi,patna,delhi,patna,tata,tata";
		String words[] = str.split(",");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.println(word);
		}
	}
}
