package Walmart;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		String str = "rajdhar";
		int arr[] = { 11, 22, 32, 121, 24, 343, 11, 22, 333, 44, 32, 42, 24 };
		Set<Character> uniqStr = new HashSet<Character>();
		Set<Character> dubStr = new HashSet<Character>();
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dubbNum = new HashSet<Integer>();
		for (char c : str.toCharArray()) {
			if (!uniqStr.add(c)) {
				dubStr.add(c);
			}
		}
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubbNum.add(num);
			}
		}
		System.out.println(uniqStr);
		System.out.println(uniqNum);
		System.out.println("dub String : ");
		System.out.println(dubStr);
		System.out.println("dub Number : ");
		System.out.println(dubbNum);
	}
}
