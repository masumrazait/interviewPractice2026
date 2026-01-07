package Infosys;

public class WhiteSpaceCounts {
	public static void main(String[] args) {
		int count = 0;
		String str = "m raza delhi patna";
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
