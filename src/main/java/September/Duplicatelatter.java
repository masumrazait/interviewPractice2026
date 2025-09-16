package September;

import java.util.HashSet;
import java.util.Set;

public class Duplicatelatter {

	public static void main(String[] args) {
		String input = "masum delhi raza".toUpperCase();
		Set<Character> uniq = new HashSet<Character>();
		Set<Character> dublicate = new HashSet<Character>();
		for (char c : input.toCharArray()) {
			if (!uniq.add(c)) {
				dublicate.add(c);
			}
		}
		System.out.println(uniq);
	}

}
