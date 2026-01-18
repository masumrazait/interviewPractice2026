package TCSMR;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 34, 54, 523 };
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
