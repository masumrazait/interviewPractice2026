package November;

import java.util.HashSet;
import java.util.Set;

public class UniqNumberAndCharacter {
	public static void main(String[] args) {
		int arr[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		String str = "editor and press";
		Set<Character> uniqChar = new HashSet<>();
		Set<Character> dubChar = new HashSet<>();
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> dubNum = new HashSet<>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniqChar.add(c) && c != ' ') {
				dubChar.add(c);
			}
		}
		System.out.println(dubChar);
		System.out.println(uniqNum);

	}
}
