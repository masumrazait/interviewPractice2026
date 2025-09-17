package September;

import java.util.HashSet;
import java.util.Set;

public class Dublicatewordcheck {

	public static void main(String[] args) {
		String str = "Tata is my tata".toLowerCase();
		String[] word = str.split(" ");
		Set<String> uniq = new HashSet<String>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}
	}

}
