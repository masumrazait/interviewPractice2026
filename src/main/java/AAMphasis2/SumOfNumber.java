package AAMphasis2;

public class SumOfNumber {
	public static void main(String[] args) {
		int num = 88;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println(num);
	}
}
