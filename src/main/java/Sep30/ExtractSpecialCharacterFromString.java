package Sep30;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "mAA#$%@#SA123)(*&";
		String rep = str.replaceAll("[^a-zAZ]", "");
		System.out.println("after replce special character is : " + rep);
	}
}
