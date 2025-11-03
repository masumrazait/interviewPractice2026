package masum;

public class SecondGreaterNumberInArray {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num = 1; num <= 100; num++) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				num = second;
			}
		}
		System.out.println(second);
	}
}
