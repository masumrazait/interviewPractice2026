package january;

public class FibonnacciSerie {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, next, num = 18;
		System.out.println(n1 + " " + n2);
		for (int i = 2; i <= num; i++) {
			next = n1 + n2;
			n1 = n2;
			n2 = next;
			System.out.println(next);
		}
		System.out.print("String expland the: ");
		String str = "a5g6j8";
		String result = "";
		for (int k = 0; k < str.length() - 1; k+=2) {
			char c = str.charAt(k);
			int count = Character.getNumericValue(str.charAt(k + 1));
			for (int j = 1; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.println(result);
	}
}
