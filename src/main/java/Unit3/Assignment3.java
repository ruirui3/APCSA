package Unit3;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome. What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ". Are you ready to crack the code?");
        String confirm = scanner.nextLine();

        if (confirm.toLowerCase().equals("yes")) {
            System.out.println("PHASE 1");
            System.out.println("Enter a string: ");
            String string = scanner.nextLine();
            if (string.length() == 3) {
                System.out.println("Correct!");

                System.out.println("\nPHASE 2");
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                if (num == 19 || (num >= 35 && num < 78)) {
                    System.out.println("Correct!");

                    System.out.println("\nPHASE 3");
                    System.out.println("Enter a number:");
                    int num2 = scanner.nextInt();

                    if ((num2 > 0 && num2 % 2 == 0) || num2 % 10 == 1) {
                        System.out.println("Correct!\n" + "You have cracked the code!");

                    } else {
                        System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
                    }

                } else {
                    System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
                }

            } else {
                System.out.println("Sorry, that was incorrect!\n" + "Better luck next time!");
            }

        }

        scanner.close();
    }
}
