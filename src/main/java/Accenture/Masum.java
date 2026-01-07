package Accenture;

import java.util.HashSet;
import java.util.Set;

public class Masum {
	public static void main(String[] args) {
		int arr[] = { 11, 2, 33, 44, 566, 73, 55, 65, 34, 65, 34, 34, 72, 13, 134, 546, 54 };
		Set<Integer> uniq = new HashSet<Integer>();
		Set<Integer> dub = new HashSet<Integer>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				dub.add(num);
			}
		}
		System.out.println(dub);
	}
}
