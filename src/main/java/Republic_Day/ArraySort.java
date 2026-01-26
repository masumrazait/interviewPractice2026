package Republic_Day;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 333, 45, 5, 45, 34, 5466, 224, 342, 2, 243, 543 };
		System.out.println("Original array list: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted array list: " + Arrays.toString(arr));
	}
}
