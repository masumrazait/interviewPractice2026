package Accenture;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompressMap {
	public static void main(String[] args) {
		String str = "aaabbbfbccc";
		String result = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}
}
