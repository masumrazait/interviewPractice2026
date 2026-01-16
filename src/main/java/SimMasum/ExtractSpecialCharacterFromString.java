package SimMasum;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "iuy$%32ANS32(320(RAZaax213)(*7";
		String rp = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(rp);
	}
}
