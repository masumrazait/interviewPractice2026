package synechron_Java;

public class NumberSum {
	public static void main(String[] args) {
		int num = 12345765;
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
