package Unit3;

import java.util.Scanner;

public class U3_L4_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        if (num >= 65 && num <= 100) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        scanner.close();
    }
}
