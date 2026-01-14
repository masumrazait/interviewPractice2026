package TCS;

public class StringExpand {
	public static void main(String[] args) {
		String str = "a4b5g3";
		String result = "";
		System.out.print("String Expanded is : ");
		for (int i = 0; i < str.length(); i += 2) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 1; j <= count; j++) {
				result = result + c;
			}
		}
		System.out.println(result);
	}

}
