package Sept21;

public class Repeatedword {

	public static void main(String[] args) {
		String str = "auto generated method stub";
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.println("non repeating charater " + c);
			}
			if (str.indexOf(c) != (str.lastIndexOf(c))) {
				System.out.println("repeating charater " + c);
			}
		}

	}

}
