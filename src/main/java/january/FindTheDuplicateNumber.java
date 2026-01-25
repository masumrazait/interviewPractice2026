package january;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int ar[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		Set<Integer> uniq = new HashSet<Integer>();
		Set<Integer> dub = new HashSet<Integer>();
		for (int num : ar) {
			if (!uniq.add(num)) {
				dub.add(num);
			}
		}
		System.out.print(uniq);
		System.out.println("\nOriginal Number : " + Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("Sorted Number : " + Arrays.toString(ar));
		System.out.print("\nReversed array : ");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
	}
}
