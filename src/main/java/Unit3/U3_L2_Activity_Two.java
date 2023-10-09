package Unit3;

import java.util.Scanner;

public class U3_L2_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        // System.out.println(Math.min(num1, num2));

        scanner.close();
    }
}
