package JavaInterview_Code_Wipro;

public class ExpandStringA2b4C2 {
	public static void main(String[] args) {
		String str = "a3b5c3";
		String result = "";
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
