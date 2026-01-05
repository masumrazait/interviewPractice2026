package Accenture;

public class StringExpand {
	public static void main(String[] args) {
		String str = "a3b3gf5";
		String result = "";
		for (int i = 0; i <= str.length(); i++) {
			char c = str.charAt(i);
			int count = Character.getNumericValue(str.charAt(i + 1));
			for (int j = 0; j < count; j++) {
				if (Character.isDigit(str.charAt(i + 1))) {
					result = result + c;
				} 
				i++;
			else {
					result = result + c;
				}
				System.out.println(result);
			}
			System.out.println(c);
		}
	}
}
