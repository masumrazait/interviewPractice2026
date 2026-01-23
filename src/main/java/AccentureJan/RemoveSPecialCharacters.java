package AccentureJan;

public class RemoveSPecialCharacters {
	public static void main(String[] args) {
		String str = "Even@@$2345&$%Let terPr654356()*intFromString";
		String r = str.replaceAll("[^a-zA-Z]", "");
		System.out.print(r);
	}

}
