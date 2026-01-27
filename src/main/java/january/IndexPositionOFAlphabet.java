package january;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "patnadelhiamnourbihar";
		char index = 'i';
		System.out.print("Index of " + index + " is : ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
