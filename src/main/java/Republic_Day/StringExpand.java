package Republic_Day;

public class StringExpand {
	public static void main(String[] args) {
		String str = "a2b3c4";
		String result = "";
		for (int i = 0; i < str.length() - 1; i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 0; j <= count; j++) {
				result = result + c + " ";
			}
		}
		System.out.print(result);
	}
}
