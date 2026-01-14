package TCS;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 11, 2, 3, 44, 24, 554, 664, 342, 11, 22, 33, 44, 5, 2, 4, 3 };
		String str = "masumraza";
		Set<Character> uniqChar = new HashSet<Character>();
		Set<Character> dubChar = new HashSet<Character>();
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dubNum = new HashSet<Integer>();
		for (char c : str.toCharArray()) {
			if (!uniqChar.add(c)) {
				dubChar.add(c);
			}
		}
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		System.out.print("Uniq character is : ");
		System.out.println(uniqChar);
		System.out.print("Uniq Number is : ");
		System.out.println(uniqNum);
	}
}
