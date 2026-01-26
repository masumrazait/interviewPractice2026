package Republic_Day;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress {
	public static void main(String[] args) {
		String str = "aaaaaddddss";
		String result = "";
		Map<Character, Integer> charcount = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charcount.put(c, charcount.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.print(result);
	}
}
