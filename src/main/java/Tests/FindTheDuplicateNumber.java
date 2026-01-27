package Tests;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 22, 33, 55, 7, 44, 352, 634, 7455, 232, 4635, 554, 342, 54, 24 };
		Set<Integer> uniqNum = new HashSet<Integer>();
		Set<Integer> dubNum = new HashSet<Integer>();
		for (int num : arr) {
			if (!uniqNum.add(num)) {
				dubNum.add(num);
			}
		}
		System.out.println(uniqNum);

		System.out.print("reverse array list: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
