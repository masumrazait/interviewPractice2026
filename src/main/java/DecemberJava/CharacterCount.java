package DecemberJava;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Map<Character, Integer> characterCount = new HashMap<>();
		for (char c : str.toCharArray()) {
			characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
		}
		System.out.println(characterCount);
	}
}
