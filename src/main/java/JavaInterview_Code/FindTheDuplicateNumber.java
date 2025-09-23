package JavaInterview_Code;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		String str = "masum";
		Set<Character> uniq = new HashSet<Character>();
		Set<Character> dublicate = new HashSet<Character>();
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dublicateNum = new HashSet<Integer>();
		for (char c : str.toCharArray()) {
			if (!uniq.add(c)) {
				dublicate.add(c);
			}
		}
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dublicateNum.add(num);
			}
		}
		System.out.println("Uniq letters: " + uniq);
		System.out.println("Uniq numbers: " + uniqNum);
	}
}
