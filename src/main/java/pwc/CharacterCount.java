package pwc;

public class CharacterCount {
	public static void main(String[] args) {
		int num = 9999999;
		while (num > 10) {
			num = sumDigits(num);
		}
		System.out.println("SingleDgit sum: " + num);
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
