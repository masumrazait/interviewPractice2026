package September;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String str = "m a s u m   r a    z  a       delhi";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
