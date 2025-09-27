package October;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = {11,11,5};
		Set<Integer> uniq = new HashSet<>();
		Set<Integer> dub = new HashSet<>();
		for (int num : arr) {
			if (!uniq.add(num)) {
				dub.add(num);
			}
		}
		uniq.removeAll(dub);
		System.out.println("dublicate number is : " + dub);
		System.out.println("uniq number is : " + uniq);
	}
}
