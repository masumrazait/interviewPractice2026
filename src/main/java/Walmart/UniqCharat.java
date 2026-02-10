package Walmart;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqCharat {
	public static void main(String[] args) {
		String str = "masum raza";
		Set<Character> uniq = new LinkedHashSet<Character>();
		Set<Character> dub = new LinkedHashSet<Character>();
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				if (!uniq.add(c)) {
					dub.add(c);
				}
			}
		}
		System.out.println(uniq);
	}
}
