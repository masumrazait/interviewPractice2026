package abstract_concept;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "dsIndexPositionOFAlphabet".toLowerCase();
		char index = 'i';
		// int indexPosition = str.indexOf(index);
		System.out.print("Index of " + index + " are: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
