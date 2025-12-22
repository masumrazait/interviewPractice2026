package DecemberJava;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 112, 21, 43, 13, 113, 33, 41, 4, 14, 244, 34 };
		System.out.println("Original Num : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
	}
}
