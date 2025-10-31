package selenumOct;

import java.util.HashMap;
import java.util.Map;

public class CHaracterCountInString {
	public static void main(String[] args) {
		String str = "aaa VVVXXX ddd";
		Map<Character, Integer> map = new HashMap<>();
		for (char words : str.toCharArray()) {
			if (words != ' ') {
				map.put(words, map.getOrDefault(words, 0) + 1);
			}
		}
		System.out.println(map);
	}
}
