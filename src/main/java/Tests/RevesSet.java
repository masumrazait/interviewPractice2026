package Tests;

public class RevesSet {
	public static void main(String[] args) {
		String str = "My Name is Masum";
		String revSen = "";
		String words[] = str.split(" ");
		for (String word : words) {
			String revWord = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revSen = revSen + revWord + " ";

		}
		System.out.println(revSen);
	}

}
