package November;

public class SecondHigherNumInArray {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num = 1; num <= 1000; num++) {
			if (num > first) {
				second = first;
				first = second;
				first = num;
			} else if (num > second && num != first) {
				second = num;
			}
		}
		System.out.println(second);
	}
}
