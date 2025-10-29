package NovJava;

import java.util.Arrays;

public class SortArrayAscending {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 6, 633, 64, 326, 23, 45, 707, 432, 3, 56, 43, 77, 332, 2, 64 };
		System.out.println("original Array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Array in Ascending Order: " + Arrays.toString(arr));
	}
}
