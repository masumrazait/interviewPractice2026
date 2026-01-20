package pwc;

import java.util.LinkedHashSet;
import java.util.Set;

public class CharacterCounts {
	public static void main(String[] args) {
		String str = "charactercounts";
		Set<Character> uniq = new LinkedHashSet<Character>();
		for (char c : str.toCharArray()) {
			uniq.add(c);
		}
		System.out.println(uniq);
	}
}
