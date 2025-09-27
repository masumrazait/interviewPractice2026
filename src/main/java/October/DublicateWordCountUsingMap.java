package October;

import java.util.HashMap;
import java.util.Map;

public class DublicateWordCountUsingMap {

	public static void main(String[] args) {
		String str = "hellow raza patna bihar manor manoj patna delhi patna delhi amnour bihar";
		String word[] = str.split(" ");
		Map<String, Integer> uniq = new HashMap<String, Integer>();
		for (String words : word) {
			uniq.put(words, uniq.getOrDefault(words, 0) + 1);
		}
		for (String words : uniq.keySet()) {
			if (uniq.get(words) > 1) {
				System.out.println(words + " is : " + uniq.get(words));
			}
		}
	}
}
