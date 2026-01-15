package Tests;

import java.util.Arrays;

public class StringWatay {
	public static void main(String[] args) {
		int arr[] = { 11, 223, 4, 5, 6, 75, 64, 343, 545, 453, 334, 5343 };
		System.out.println("Original Arrays: " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays: " + Arrays.toString(arr));
	}
}
