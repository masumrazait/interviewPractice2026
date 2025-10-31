package NovemberJavaCoding;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 11, 22, 33, 44, 555, 66, 77, 88, 99, 22 };
		String str = "laptopideapad";
		Set<Character> uniqChar = new HashSet<Character>();
		Set<Character> dubChar = new HashSet<Character>();
		Set<Integer> uniq = new HashSet<Integer>();
		Set<Integer> dub = new HashSet<Integer>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				dub.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniqChar.add(c)) {
				dubChar.add(c);
			}
		}
		System.out.println("uniq num is : " + uniq);
		System.out.println("Uniq charcter: " + uniqChar);
	}
}
