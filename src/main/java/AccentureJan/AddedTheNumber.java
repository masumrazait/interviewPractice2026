package AccentureJan;

public class AddedTheNumber {
	public static void main(String[] args) {
		int num = 888;
		while (num >= 10) {
			num = isDigitSum(num);
		}
		System.out.println("Final single digit is: " + num);
	}

	public static int isDigitSum(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num = num / 10;
		}
		return sum;
	}
}
