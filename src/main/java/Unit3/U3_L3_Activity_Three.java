package Unit3;

import java.util.Scanner;

public class U3_L3_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter in two Integers");
        System.out.print("> ");
        int num1 = scanner.nextInt();
        System.out.print("> ");
        int num2 = scanner.nextInt();

        int ans = num1 + num2;

        System.out.println("\n" + num1 + " + " + num2 + " =  ?");
        System.out.print("> ");
        int guess = scanner.nextInt();

        if (ans == guess) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong");
        }

        scanner.close();
    }
}
