package TCSMR;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int ar[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		String str = "simaranmasum";
		Set<Character> uniqchar = new LinkedHashSet<Character>();
		Set<Character> dubchar = new LinkedHashSet<Character>();
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dubNum = new HashSet<Integer>();
		for (char c : str.toCharArray()) {
			if (!uniqchar.add(c)) {
				dubchar.add(c);
			}
		}
		for (int num : ar) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		System.out.println(uniqchar);
		System.out.println(uniqNum);
	}

}
