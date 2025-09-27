package October;

public class FindSpecialCharacter {

	public static void main(String[] args) {
		String str = "M134#$%A#$#%S)(*&U(*&M))";
		String replace = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replace);
	}

}
