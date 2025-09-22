package Sep22;

public class EvenLetterPrintFromString {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Even-positioned letters are:");
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.print(str.charAt(i) + " ");
			count++;
		}
		System.out.println("\n"+count);
	}

}
