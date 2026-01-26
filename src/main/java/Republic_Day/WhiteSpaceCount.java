package Republic_Day;

public class WhiteSpaceCount {
	public static void main(String[] args) {
		String str = "Pa tn aDe             lhiKolkataBiharAmnourSARAn";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.print("Total count is :" + count);
	}
}
