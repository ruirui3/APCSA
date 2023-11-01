package Unit4;

import java.util.Scanner;

public class U4_L4_Activity_Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine().toLowerCase();

        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            String letter = string.substring(i, i + 1);
            boolean isMostCommonLetter = letter.equals("e") ||
                    letter.equals("t") ||
                    letter.equals("a") ||
                    letter.equals("i") ||
                    letter.equals("o");
            if(!isMostCommonLetter){
                newString+=letter;
            }
        }

        System.out.println(newString);
        scanner.close();
    }
}
