package Unit3;

import java.util.Scanner;

public class U3_L2_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature?");
        double temp = scanner.nextDouble();

        if (!(temp >= 97.0 && temp <= 99.0)) {
            System.out.println("NOT NORMAL");
        }

        scanner.close();
    }
}
