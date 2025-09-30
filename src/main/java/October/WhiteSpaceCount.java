package October;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "mas      raza sz dek s";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
