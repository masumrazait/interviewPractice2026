package NovemberJavaCoding;

import java.util.Arrays;

public class ArrayDescending {

	public static void main(String[] args) {
		int arr[] = { 25, 568, 584, 26, 45, 85 };
		System.out.println("Original array : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Accending ordered : " + Arrays.toString(arr));

		System.out.print("Array in  del Descending Order: [");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
			if (i != 0)
				System.out.print(",");
		}
		System.out.print("]");
	}
}
