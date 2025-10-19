package masum;

public class SecondLargeNumber {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int arr[] = { 112, 12345, 11, 22, 33, 44, 555, 666, 777, 888, 999, 1111, 11112, 13441 };
		for (int num : arr) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > first && num != second) {
				num = second;
			}
		}
		System.out.println(second);
	}
}
