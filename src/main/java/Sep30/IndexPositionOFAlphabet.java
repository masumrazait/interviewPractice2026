package Sep30;

public class IndexPositionOFAlphabet {
	public static void main(String[] args) {
		String str = "masumrazasahil";
		char index = 's';
		//int indexPosition = str.indexOf(index);
		System.out.print("Index postion of " + index + " are: ");
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
