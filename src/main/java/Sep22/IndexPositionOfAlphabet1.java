package Sep22;

import java.util.Scanner;

public class IndexPositionOfAlphabet1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Take character input
        System.out.print("Enter a character to find: ");
        char ch = sc.next().charAt(0);

        System.out.print("Character '" + ch + "' found at (0-based index): ");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // new line

        System.out.print("Character '" + ch + "' found at (1-based index): ");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                System.out.print((i + 1) + " ");
            }
        }

        sc.close();
    }
}
