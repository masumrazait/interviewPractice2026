package Coforge;

public class RevSentence {
	public static void main(String[] args) {
		String str = "etirW ruoy edoc ni siht rotide dna sserp nuR dna gubeD avaj margorp enilno edoc ni siht rotide";
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
		System.out.print(revSen.trim());
	}
}
