package Unit3;

import java.util.Scanner;

public class U3_L7_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 strings:");

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("Equal!");
        } else if (string1.toLowerCase().equals(string2.toLowerCase())) {
            System.out.println("Different case");
        } else if (string1.length() == string2.length()
                && string1.substring(0, string1.length() - 1).equals(string2.substring(0, string2.length() - 1))) {
            System.out.println("Close enough");
        } else {
            System.out.println("Try again");
        }

        scanner.close();
    }
}
