package Unit4;

import java.util.Scanner;

public class U4_L4_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        if (word1.length() == word2.length()) {
            
            for (int i = word1.length(); i > 0; i--) {
                System.out.print(word2.substring(i - 1, i));
                System.out.print(word1.substring(i - 1, i));
            }

        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}
