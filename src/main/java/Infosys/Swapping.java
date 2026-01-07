package Infosys;

public class Swapping {
	public static void main(String[] args) {
		int a = 11, b = 13;
		System.out.println("Before swapping the num :" + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping the num : " + a + " " + b);
	}
}
