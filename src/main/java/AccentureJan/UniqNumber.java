package AccentureJan;

import java.util.HashSet;
import java.util.Set;

public class UniqNumber {
	public static void main(String[] args) {
		int ar[] = { 133, 2, 134, 53554, 747, 747, 43634, 747, 86, 346 };
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> dub = new HashSet<>();
		for (int num : ar) {
			if (!uniq.add(num)) {
				dub.add(num);
			}
		}
		System.out.print(dub);
		System.out.print(uniq);
	}
}
