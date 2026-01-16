package SimMasum;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordFinder {
	public static void main(String[] args) {
		String str = "Tata,Swift,Audi,Mercedes,Tata,Renault";
		String words[] = str.split(",");
		Map<String, Integer> charCart = new LinkedHashMap<>();
		for (String word : words) {
			charCart.put(word, charCart.getOrDefault(word, 0) + 1);
		}
		for (String word : charCart.keySet()) {
			if (charCart.get(word) == 1) {
				System.out.println(word + " " + charCart.get(word));
			}
		}
	}
}
