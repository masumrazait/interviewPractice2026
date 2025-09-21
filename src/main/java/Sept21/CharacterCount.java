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
	}

}
