package Coforge;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 11, 22, 32 };
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > s && num != f) {
				s = num;
			}
		}
		System.out.println(s);
	}
}
