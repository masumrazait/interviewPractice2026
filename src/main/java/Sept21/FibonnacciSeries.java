package Sept21;

public class FibonnacciSeries {

	public static void main(String[] args) {
		int num = 18;
		int n1 = 0, n2 = 1, sum;
		System.out.println(n1 + "    " + n2);
		for (int i = 3; i <= num; i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.println(sum);
		}
	}

}
