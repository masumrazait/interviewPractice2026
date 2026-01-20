package pwc;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 55, 66, 77, 11, 22, 333, 21, 342, 422, 42 };
		System.out.println("Original Arrays : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays : " + Arrays.toString(arr));
	}
}
