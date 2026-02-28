package March;

import java.util.HashMap;
import java.util.Map;

public class Uniq {
	public static void main(String[] args) {
		String str = "amnour delhi patna bihar delhi amnour delhi raza bharat";
		String words[] = str.split(" ");
		Map<String, Integer> uniq = new HashMap<String, Integer>();
		for (String word : words) {
			if (uniq.containsKey(word)) {
				uniq.put(word, uniq.get(word) + 1);
			} else {
				uniq.put(word, 1);
			}
		}
		for (String word : uniq.keySet()) {
			if(uniq.get(word)==1)
			System.out.println(word + " -> " + uniq.get(word));
		}
	}
}
