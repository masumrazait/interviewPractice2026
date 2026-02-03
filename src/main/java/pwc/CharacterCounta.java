package pwc;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CharacterCounta {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Set<Character> uniq = new LinkedHashSet<Character>();
		Set<Character> dub = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				dub.add(c);
			}
		}
		System.out.print(uniq + " ");
		// break; first repeated characters is then used break
	}
}
