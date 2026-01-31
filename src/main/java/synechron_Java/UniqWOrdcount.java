package synechron_Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class UniqWOrdcount {
	public static void main(String[] args) {
		String str = "masum delhi patna bihar amnour bihar patna raza";
		String words[] = str.split(" ");
		Map<String, Integer> wordc = new LinkedHashMap<>();
		for (String word : words) {
			wordc.put(word, wordc.getOrDefault(word, 0) + 1);
		}
		for (String word : wordc.keySet()) {
			if (wordc.get(word) == 1)
				System.out.print(word + " -> " + wordc.get(word) + " ");
		}
	}
}
