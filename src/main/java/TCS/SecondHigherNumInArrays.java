package TCS;

public class SecondHigherNumInArrays {
	public static void main(String[] args) {
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		int first = Integer.MAX_VALUE;
		int sec = Integer.MAX_VALUE;
		for (int num = 1; num <= 100; num++) {
			if (num > f) {
				s = f;
				f = num;
			} else if (num > sec && num != f) {
				sec = num;
			}
		}
		for (int numm = 1; numm <= 1000; numm++) {
			if (numm < first) {
				sec = first;
				first = numm;
			} else if (numm < sec && numm != first) {
				sec = numm;
			}
		}
		System.out.println(sec);
		System.out.println(s);
	}
}
