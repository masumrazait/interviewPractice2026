package Tests;

public class StringSwapping {
	public static void main(String[] args) {
		String str = "raza masum";
		String words[] = str.split(" ");
		String swappep = words[1] + " " + words[0];
		System.out.println(swappep);
	}
}
