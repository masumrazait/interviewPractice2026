package March;

public class EvenLetterPrintFromString {
    public static void main(String[] args) {
        String str = "masumrazadelhi";

        // Remove spaces completely
        str = str.replace(" ", "");

        // Now count only characters
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) { // even position among letters
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}

//m s m a a e h 