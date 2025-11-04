package Infosys;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int arr[] = { 11, 22, 33, 44, 55, 66, 99, 100, 200, 77 };
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;

			} else if (num > second && num != first) {
				second = num;
			}
		}
		System.out.println(second);
	}
}
