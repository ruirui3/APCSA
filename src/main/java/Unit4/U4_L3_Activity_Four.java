package Unit4;

import java.util.Scanner;

public class U4_L3_Activity_Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();

        if (num > 0) {
            for (int i = num; i >= 0; i--) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("error");
        }

        scanner.close();
    }

    public static void alternateAnswer(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num = scanner.nextInt();
        num = num - (num % 3);

        if (num > 0) {
            for (int i = num; i >= 0; i -= 3) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("error");
        }

        scanner.close();
    }
}
