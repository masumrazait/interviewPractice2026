package InterfacesConcept;

public class RepeatingCharacter {

	public static void main(String[] args) {
		String str = "masum";
		int count = 1;
		for (char c : str.toCharArray()) {
			if (str.indexOf(c) == (str.lastIndexOf(c))) {
				System.out.println("non repeating : "+c);
				count++;
			}
			if(str.indexOf(c)!=(str.lastIndexOf(c))) {
				System.out.println("repeating : "+c);
				
			}
		}
		System.out.println(count);
		

	}

}
