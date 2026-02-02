package DecemberJava;

public class Revese {
	public static void main(String[] args) {
		String str = "DecemberJava";
		String rev = "";
		System.out.print("Reverse string is : ");
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.print(rev);
	}
}
