package Sep22;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		String Str = "ram,ama,nam,del,del,tata,ta,taa,tata,delhi,opatna,patna,delhi,amnour";
		String[] word = Str.split(",");
		Set<String> uniq = new HashSet<>();
		for (String words : word) {
			uniq.add(words.trim());
		}
		for (String words : uniq) {
			System.out.println(words);
		}
	}

}
