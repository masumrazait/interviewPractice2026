package Accenture;

import java.util.Arrays;

public class Arraysort {
	public static void main(String[] args) {
		int arr[] = { 11, 332, 12, 543, 54, 343, 2534, 54, 223, 423, 2332 };
		System.out.println("Original Arrays : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Arrays : " + Arrays.toString(arr));
	}
}
