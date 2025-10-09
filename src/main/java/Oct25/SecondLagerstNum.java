package Oct25;

public class SecondLagerstNum {
	public static void main(String[] args) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num = 0; num <= 10; num++) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > first && num != second) {
				second = num;
			}
		}
		System.out.println(second);
	}
}
