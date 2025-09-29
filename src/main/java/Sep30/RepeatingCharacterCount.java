package Sep30;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterCount {
	public static void main(String[] args) {
		String str = "masimrazapatnamahi";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
		System.out.println("repeating character is: ");
		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " -> " + e.getValue());
			}
		}
	}
}
