package Republic_Day;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCOunt {
	public static void main(String[] args) {
		String str = "patnabiharamnorsaran";
		Map<Character, Integer> charcount = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
		}
		for (char c : charcount.keySet()) {
			if(charcount.get(c)==1)
			System.out.println(c + " -> " + charcount.get(c) + " ");
		}
	}
}
