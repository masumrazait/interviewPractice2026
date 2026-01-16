package SimMasum;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 11, 2, 3, 44, 55, 66, 77, 881, 23, 2 };
		String str = "masumraza";
		Set<Character> uniqChar = new LinkedHashSet<Character>();
		Set<Character> dubChar = new LinkedHashSet<Character>();
		Set<Integer> uniqNum = new LinkedHashSet<Integer>();
		Set<Integer> dubNum = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniqChar.add(c)) {
				dubChar.add(c);
			}
		}
		System.out.println(uniqChar);
		System.out.println(uniqNum);
	}
}
