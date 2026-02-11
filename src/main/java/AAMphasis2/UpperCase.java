package AAMphasis2;

public class UpperCase {
	public static void main(String[] args) {
		String str = "maDhUbaNiDelhI";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
