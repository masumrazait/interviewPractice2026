package Sept21;

import java.util.*;

public class CharacterCount {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String input = str.nextLine();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : input.toCharArray()) {
			if (c != ' ') {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
		}
		System.out.println(map);

		String str1 = "Automation";
		Map<Character, Integer> maps = new HashMap<>();
		for (char c : str1.toCharArray()) {
			maps.put(c, maps.getOrDefault(c, 0) + 1);
		}
		maps.forEach((k, v) -> {
			if (v > 1)
				System.out.println(k + " is duplicated");
		});
		str.close();
	}

}
