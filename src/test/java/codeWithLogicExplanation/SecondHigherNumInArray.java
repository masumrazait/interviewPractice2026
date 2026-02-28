package codeWithLogicExplanation;

public class SecondHigherNumInArray {

	public static void main(String[] args) {

		int arr[] = { 112, 34, 553, 35, 23, 678, 876, 366, 53, 757, 3425, 4444 };

		int first = Integer.MIN_VALUE; // highest number
		int second = Integer.MIN_VALUE; // second highest number

		// Loop through each number in the array
		for (int num : arr) {
			if (num > first) {
				// If current number is greater than first,
				// then update second as old first, and first as current number
				second = first;
				first = num;
			} else if (num > second && num != first) {
				// If current number is greater than second but not equal to first,
				// update second
				second = num;
			}
		}

		System.out.println("Second highest number is : " + second);
	}
}