package DecemberJava;

import java.util.HashSet;

public class FirstRepeatdCHaracter {
	public static void main(String[] args) {
		String str = "prapprogramming";
		HashSet<Character> uniq = new HashSet<Character>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				System.out.println(c);
				break;
			}
		}
	}
}
