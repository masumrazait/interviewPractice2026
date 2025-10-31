package NovemberJavaCoding;

public class SecondHighestNum {
	public static void main(String[] args) {
		int arr[] = { 25, 568, 584, 26, 45, 85,1111 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > first) {
				second = first;
				first=num;
			} else if (num > second && num != first) {
				num = second;
			}
		}
		System.out.println(second);
	}
}
