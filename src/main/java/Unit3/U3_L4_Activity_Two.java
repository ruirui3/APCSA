package Unit3;

import java.util.Scanner;

public class U3_L4_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean positive = num1 >= 0 && num2 >= 0;
        boolean even = num1 % 2 == 0 && num2 % 2 == 0;

        if (positive && even) {
            System.out.println("Both are positive and even.");
        } else {
            System.out.println("At least one is negative or odd.");
        }

        scanner.close();
    }
}
