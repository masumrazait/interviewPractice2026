package Oct25;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 4, 44, 55, 66, 777, 88, 55, 33, 22, 11, 22, 44, 56 };
		Set<Integer> uniq = new HashSet<Integer>();
		Set<Integer> dubl = new HashSet<Integer>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				dubl.add(num);
			}
		}
		System.out.println(dubl);
	}
}
