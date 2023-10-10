package Unit3;

import java.util.Scanner;

public class U3_L3_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }

        scanner.close();

    }
}
