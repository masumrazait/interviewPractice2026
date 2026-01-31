package synechron_Java;

public class SecondHighestNumber {
	public static void main(String[] args) {
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;

		for (int num = 1; num <= 100; num++) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > s && num != f) {
				s = num;
			}
		}
		System.out.println("second highest num is: " + s);
	}

}
