package DecemberJava;

import java.util.LinkedHashSet;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String str = "programming";

		System.out.print("Duplicate is : ");
		LinkedHashSet<Character> uniq = new LinkedHashSet<Character>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				System.out.print(c+" ");
			}
		}
	}

}
