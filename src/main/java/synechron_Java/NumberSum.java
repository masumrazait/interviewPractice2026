package synechron_Java;

public class NumberSum {
	public static void main(String[] args) {
		int num = 123456;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		System.out.println(num);

		int ditit = 123456;
		int sums = 0;
		while (ditit > 0) {
			sums += ditit % 10;
			ditit = ditit / 10;
		}
		System.out.println(sums);
	}
}
