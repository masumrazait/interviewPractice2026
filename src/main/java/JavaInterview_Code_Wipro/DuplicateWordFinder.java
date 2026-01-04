package JavaInterview_Code_Wipro;

import java.util.*;

public class DuplicateWordFinder {

	public static void main(String[] args) {
		String str = "masum,raza,delhi,kollkata,delhi,tata,patna,amnour,amnour";
		String word[] = str.split(",");
		Set<String> uniq = new HashSet<>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}

	}

}
