package Unit4;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the message to be shortened");
        String string = " " + scanner.nextLine().toLowerCase();
        String alg1String = "";
        String alg2String = "";

        int vowelCount = 0;
        int repeatCount = 0;
        for (int i = 1; i < string.length(); i++) {
            String letter = string.substring(i, i + 1);
            String previousLetter = string.substring(i - 1, i);
            boolean isVowel = letter.equals("a") ||
                    letter.equals("e") ||
                    letter.equals("i") ||
                    letter.equals("i") ||
                    letter.equals("o") ||
                    letter.equals("u");

            if (!previousLetter.equals(" ") && isVowel)
                vowelCount++;
            else if (previousLetter.equals(letter))
                repeatCount++;
            else
                alg1String += letter;
        }

        int uniqueNumOfCharacters = 0;
        for (int i = 0; i < string.length(); i++) {
            String curLetter = string.substring(i, i + 1);

            if (!curLetter.equals(" ") && alg2String.indexOf(curLetter) == -1) {
                uniqueNumOfCharacters++;
                int count = 0;
                for (int j = 0; j < string.length(); j++) {
                    String iterLetter = string.substring(j, j + 1);

                    if (iterLetter.equals(curLetter))
                        count++;
                }

                alg2String += count + curLetter;
            }
        }

        System.out.println();
        System.out.println("Algorithm 1");
        System.out.println("Vowels removed: " + vowelCount);
        System.out.println("Repeats removed: " + repeatCount);
        System.out.println("Algorithm 1 message: " + alg1String);
        System.out.println("Algorithm 1 characters saved: " + (vowelCount + repeatCount));

        System.out.println();

        System.out.println("Algorithm 2");
        System.out.println("Unique characters found: " + uniqueNumOfCharacters);
        System.out.println("Algorithm 2 message: " + alg2String);
        System.out.println("Algorithm 2 characters saved: " + (string.length() - alg2String.length() - 1));

        scanner.close();

    }
}
