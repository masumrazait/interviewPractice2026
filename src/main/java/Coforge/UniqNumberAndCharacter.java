package Coforge;

import java.util.HashSet;
import java.util.Set;

public class UniqNumberAndCharacter {
	public static void main(String[] args) {
		String str = "masum";
		int arr[] = { 11, 22, 33, 41, 343, 234, 24, 234, 112, 432 };
		Set<Character> uniqChar = new HashSet<>();
		Set<Character> dubChar = new HashSet<>();
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> dubNum = new HashSet<>();
		System.out.print("Uniq num is : ");
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
		System.out.println(uniqNum);
		System.out.print("\nUniq character is : ");
		System.out.println(uniqChar);
	}
}
