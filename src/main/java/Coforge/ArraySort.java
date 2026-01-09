package Coforge;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 111, 22, 3133, 414, 55, 66, 99, 100, 200, 77 };
		System.out.println("Unsorted Arrays: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays: " + Arrays.toString(arr));
	}
}
