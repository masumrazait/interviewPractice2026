package InterfacesConcept;

public class SecondHigherNumInArray {
	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 16, 17, 18, 19, 20 };
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for (int num =1;num<=100;num++) {
			if (num > first) {
				second = first;
				first = num;
			} else if (num > second && num != first) {
				num = second;
			}
		}
		System.out.println(second);
	}

}
