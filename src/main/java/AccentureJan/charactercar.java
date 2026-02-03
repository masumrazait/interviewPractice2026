package AccentureJan;

import java.util.HashSet;
import java.util.Set;

public class charactercar {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Set<Character> uniq = new HashSet<Character>();
		Set<Character> dub = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				dub.add(c);
			}
		}
		System.out.println(uniq);
	}
}
