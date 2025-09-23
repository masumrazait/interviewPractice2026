package JavaInterview_Code;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "M#$%A8765S4567%$%&U7654m";
		String remove = str.replaceAll("[^a-zA-z]", "");
		System.out.println(remove);
	}

}
