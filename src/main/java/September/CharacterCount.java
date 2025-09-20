package September;

import java.util.HashMap;

public class CharacterCount {

	public static void main(String[] args) {
		String str = "CharacterCount    ";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(map);
	}
}
