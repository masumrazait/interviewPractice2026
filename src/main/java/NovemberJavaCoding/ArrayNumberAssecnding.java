package NovemberJavaCoding;

import java.util.Arrays;

public class ArrayNumberAssecnding {
	public static void main(String[] args) {
		int arr[] = { 11, 22,0, 45, 776, 76, 4, 6, 4565, 2, 54 };
		System.out.println("Original num: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Assending order:" + Arrays.toString(arr));
		System.out.print("Descending order: [");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i != 0) {
				System.out.print(" , ");
			}
		}
		System.out.print("]");
	}
}
