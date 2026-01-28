package abstract_concept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		String str = "IndiaDelhi".toLowerCase();
		Set<Character> uniqStr = new LinkedHashSet<Character>();
		Set<Character> dubStr = new LinkedHashSet<Character>();
		Set<Integer> uniqNum = new HashSet<>();
		Set<Integer> dubNum = new HashSet<>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		for (char c : str.toCharArray()) {
			if (!uniqStr.add(c)) {
				dubStr.add(c);
			}
		}
		System.out.print("Uniq num is : ");
		System.out.print(uniqNum + " ");

		System.out.print("\nUniq characters is : ");
		System.out.print(uniqStr + " ");
	}
}
