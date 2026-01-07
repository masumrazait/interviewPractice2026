package Accenture;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int arr[] = { 11, 2, 33, 44, 566, 73, 55, 65, 34, 65, 34, 34, 72, 13, 134, 546, 54 };
		System.out.println("oringal array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array: " + Arrays.toString(arr));
	}
}
