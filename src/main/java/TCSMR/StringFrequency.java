package TCSMR;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringFrequency {
	public static void main(String[] args) {
		String str = "masumraza";
		Map<Character, Integer> charcout = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charcout.put(c, charcout.getOrDefault(c, 0) + 1);
		}
		System.out.println(charcout);
	}

}
