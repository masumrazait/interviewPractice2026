package pwc;

public class SumOfTheNumber {
	public static void main(String[] args) {
		int num = 987654321;
		while (num >= 10) {
			num = sumDigits(num);
		}
		System.out.println("single digit sum: " + num);
	}

	public static int sumDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
