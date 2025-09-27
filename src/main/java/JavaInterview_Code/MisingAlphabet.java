package JavaInterview_Code;

public class MisingAlphabet {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmrstuvwxyznd";

        // Convert to lowercase and remove non-alphabetic characters
        sentence = sentence.toLowerCase();

        StringBuilder missing = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                missing.append(c);
            }
        }

        System.out.println("Missing letters: " + missing);
    }
}
