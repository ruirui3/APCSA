package Unit4;

import java.util.Scanner;

public class U4_L4_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine().toLowerCase();
        int pTimes = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).equals("p")) {
                String nextLetter = string.substring(i + 1, i + 2);
                boolean isVowel = nextLetter.equals("a") ||
                        nextLetter.equals("e") ||
                        nextLetter.equals("i") ||
                        nextLetter.equals("i") ||
                        nextLetter.equals("o") ||
                        nextLetter.equals("u");

                if (isVowel) {
                    pTimes++;
                }
            }
        }

        System.out.println("Contains p followed by a vowel " + pTimes + " times.");
        scanner.close();
    }

}
