package pwc;

import java.util.Arrays;

public class ArraySorts {
	public static void main(String[] args) {
		int arr[] = { 114, 2322, 33, 244, 55, 121, 2323, 211 };
		System.out.println("Original Arrays: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays: " + Arrays.toString(arr));
	}
}
