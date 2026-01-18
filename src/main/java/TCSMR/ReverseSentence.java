package TCSMR;

public class ReverseSentence {
	public static void main(String[] args) {
		String str = "emocleW ot aidnI dna fi uoy emoc uoy era emoclew ot ym esuoh";
		String words[] = str.split(" ");
		String revSen = "";
		for (String word : words) {
			String revWord = "";
			int len = word.length();
			for (int i = len - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
			}
			revSen = revSen + revWord + " ";
		}
		System.out.println(revSen.trim());
	}
}
