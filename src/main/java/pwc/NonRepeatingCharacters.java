package pwc;

public class NonRepeatingCharacters {
	public static void main(String[] args) {
		String str = "masumrazasimmi";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c);
			}
		}
		System.out.println();
		String d="SIMARNmasumraza".toLowerCase();
		for (char s: d.toCharArray()) {
			if (str.indexOf(s) != str.lastIndexOf(s)) {
				System.out.print(s);
			}
		}
	}
}
