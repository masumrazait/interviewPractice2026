package Oct25;

public class GreaterNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 2 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		for (int r : arr) {
			if (r < min) {
				min = r;
			}
		}
		System.out.println("max number is: " + max);
		System.out.println("min number is: " + min);
	}

}
