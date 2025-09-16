package September;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 3, 33, 4, 5, 6, 7, 8, 8, 8, 22 };

		Set<Integer> duplicate = new HashSet<Integer>();
		Set<Integer> uniq = new HashSet<Integer>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println(uniq);
	}

}
