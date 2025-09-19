package September;

import java.util.HashSet;
import java.util.Set;

public class DublicateCharacter {

	public static void main(String[] args) {
		String str = "masumraza";
		int[] arr = { 11, 1, 11, 33, 2, 332, 442, 3, 22, 33, 44, 53, 24, 53, 454, 34, 3, 343, 3 };
		Set<Integer> uniqnum = new HashSet<Integer>();
		Set<Integer> dublicatenum = new HashSet<Integer>();
		Set<Character> uniqstr = new HashSet<>();
		Set<Character> dublicatestr = new HashSet<>();
		for (int num : arr) {
			if (!uniqnum.add(num)) {
				dublicatenum.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniqstr.add(c)) {
				dublicatestr.add(c);
			}
		}
		System.out.println(uniqnum);
		System.out.println(uniqstr);

	}

}
