package NovJava;

public class Non_RepeatingCharacters {
	public static void main(String[] args) {
		String str = "Run and Debug java program online Write your code in java java this editor and press"
				.toLowerCase();
		System.out.print("Non Repeating charcater is: ");
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.print(c + " ");
			}
		}
	}
}
