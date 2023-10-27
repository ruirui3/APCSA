package Unit4;

import java.util.Scanner;

public class U4_L3_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num > 0 && num < 50) {
            int i = 0;
            for (int j = num; j <= 50; j++) {
                System.out.print(j + " ");
                i++;
                if (i == 5) {
                    System.out.println("");
                    i = 0;
                }
            }
        } else {
            System.out.println("error");
        }

        scanner.close();
    }

    public static void alternateAnswer(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int constant = num % 10;

        if (num <= 0 || num >= 50) {
            System.out.println("error");
        } else {
            for (int i = num; i <= 50; i++) {
                if ((i - constant) % 5 == 0) {
                    System.out.println();
                }
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
