package AAMphasis2;

public class ReveseSentnece {
	public static void main(String[] args) {
		String str = "ihled si latipac fo aidnI";
		String words[] = str.split(" ");
		String revSen = "";
		for (String word : words) {
			String revWord = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);

			}
			revSen = revSen + revWord + " ";
		}
		System.out.println(revSen.trim());
	}

}
