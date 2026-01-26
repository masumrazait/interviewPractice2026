package Republic_Day;

import java.util.HashSet;
import java.util.Set;

public class UniqWords {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Set<String> uniq = new HashSet<>();
		for (String word : words) {
			uniq.add(word.trim());
		}
		for (String word : uniq) {
			System.out.print(word + " ");
		}
	}

}
