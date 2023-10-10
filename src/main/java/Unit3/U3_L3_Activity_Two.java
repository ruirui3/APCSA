package Unit3;

import java.util.Scanner;

public class U3_L3_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.nextLine();

        if (grade.equals("A")) {
            System.out.println("90-100");

        } else if (grade.equals("B")) {
            System.out.println("80-90");

        } else if (grade.equals("C")) {
            System.out.println("70-80");

        } else if (grade.equals("D")) {
            System.out.println("60-70");

        } else if (grade.equals("F")) {
            System.out.println("0-60");

        } else {
            System.out.println("Invalid letter grade");

        }

        scanner.close();
    }
}
