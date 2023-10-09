package Unit3;

import java.util.Scanner;

public class U3_L2_Activity_Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two test values");
        double test1 = scanner.nextDouble();
        double test2 = scanner.nextDouble();

        if (!(test1 <= 100.0 && test1 >= 0.0))
            System.out.println("Not Valid");
        if (!(test2 <= 100.0 && test1 >= 0.0))
            System.out.println("Not Valid");

        scanner.close();

    }
}
