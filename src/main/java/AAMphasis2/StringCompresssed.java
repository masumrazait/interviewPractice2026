package AAMphasis2;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompresssed {
	public static void main(String[] args) {
		String str = "aaaaaaggggg";
		String result = "";
		Map<Character, Integer> charc = new LinkedHashMap<Character, Integer>();
		for (char c : str.toCharArray()) {
			charc.put(c, charc.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charc.entrySet()) {
			result = result + entry.getKey() + entry.getValue();
		}
		System.out.println(result);
	}

}
