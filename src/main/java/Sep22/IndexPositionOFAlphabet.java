package Sep22;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String sc = "masumsonumonushahilm";
		char index = 'm';
		//int indexPosition = sc.indexOf(index);
		System.out.print("Index positions of '" + index + "' are: ");
		for (int i = 0; i < sc.length(); i++) {
			if (sc.charAt(i) == index) {
				System.out.print(i + 1+" ");
			}
		}
	}
}
