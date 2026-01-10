package Coforge;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringStr {
	public static void main(String[] args) {
		String str = "aaaaagggmmmmmdddd";
		String result = "";
		int count = 1;
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
