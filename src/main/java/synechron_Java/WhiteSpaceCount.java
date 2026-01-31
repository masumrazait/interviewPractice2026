package synechron_Java;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "mas     m";
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total blank space is : " + count);
	}
}
