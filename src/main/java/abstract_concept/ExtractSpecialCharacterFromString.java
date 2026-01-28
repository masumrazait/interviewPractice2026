package abstract_concept;

public class ExtractSpecialCharacterFromString {
	public static void main(String[] args) {
		String str = "m@#$23A234(*&s+_)324354(u_)(23456*&m";
		String repl = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(repl);
	}
}
