package NovemberJavaCoding;

public class VowelCount {
	public static void main(String[] args) {
		String str = "VowelCount";
		String vowel="AEIOUaeiou";
		int vowelcount=0;
		int consonentcount=0;
		for(char c:str.toCharArray()) {
			if(vowel.indexOf(c)!=-1) {
				vowelcount++;
			}else {
				consonentcount++;
			}
		}
		System.out.println("vowel count is : "+vowelcount);
		System.out.println("consonent count is : "+consonentcount);
	}
}
