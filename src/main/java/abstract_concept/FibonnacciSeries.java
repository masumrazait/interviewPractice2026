package abstract_concept;

public class FibonnacciSeries {
	public static void main(String[] args) {
		int num = 18, n1 = 0, n2 = 1, next;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i <= num; i++) {
			next = n1 + n2;
			n1 = n2;
			n2 = next;
			System.out.println(next);
		}
	}
}
