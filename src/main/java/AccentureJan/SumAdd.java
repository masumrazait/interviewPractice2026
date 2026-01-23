package AccentureJan;

public class SumAdd {
	public static void main(String[] args) {
		int num = 9999;
		while (num >= 10) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
        System.out.println("Single digit sum = " + num);
	}
}
