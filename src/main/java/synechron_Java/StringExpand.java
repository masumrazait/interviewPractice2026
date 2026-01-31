package synechron_Java;

public class StringExpand {

	public static void main(String[] args) {
		String str = "a9d4g6";
		String result = "";
		System.out.print("Expanded String is : ");
		for (int i = 0; i < str.length() - 1; i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 1; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.print(result);
	}
}
