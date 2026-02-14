package NovemberJavaCoding;

public class IndexPositionOfAlphabet {
	public static void main(String[] args) {
		String str = "laptopideapad";
		char index = 'p';
		//int indexposition = str.indexOf(index);
		System.out.print("Index positions of '" + index + "' are: ");
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + "  ");
			}
		}
	}
}
