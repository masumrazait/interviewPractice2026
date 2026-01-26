package Republic_Day;

public class UpperCaseCOunt {
	public static void main(String[] args) {
		String str = "PatnaDelhiKolkataBiharAmnourSARAn";
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				System.out.print(c);
			}
		}
	}
}
