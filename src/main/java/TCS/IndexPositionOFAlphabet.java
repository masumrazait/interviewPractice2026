package TCS;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "simranmasumdelhimadhpardesh";
		char index = 'm';
		System.out.print("index of " + index + " is ");
		//int indexPosition = str.indexOf(index);
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
