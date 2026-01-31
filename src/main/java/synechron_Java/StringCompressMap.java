package synechron_Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressMap {
	public static void main(String[] args) {
		String str = "aaaaaaaddddgggg";
		String result = "";
		Map<Character, Integer> charco = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charco.put(c, charco.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charco.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
