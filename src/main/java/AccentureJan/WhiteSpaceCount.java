package AccentureJan;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "adb                                                                                                                              ad";
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
