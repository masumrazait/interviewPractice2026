package synechron_Java;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 11, 24, 53, 432, 432, 3422, 4524, 1323, 334, 23323, 43, 244, 6556, 7656, 5 };
		System.out.println("Original array: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted arrays: " + Arrays.toString(arr));

		// Added new code for the reverse array
		System.out.print("reverse array : ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print("[ " + arr[i] + " ]");
		}
	}

}
