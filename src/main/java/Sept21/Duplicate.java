package Sept21;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String str = "Automation".toLowerCase();
		Set<Character> duCharacteras = new HashSet<>();
		Set<Character> uniq = new HashSet<>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				duCharacteras.add(c);
			}
		}
		System.out.println("dublicate is: "+duCharacteras);

	}

}
