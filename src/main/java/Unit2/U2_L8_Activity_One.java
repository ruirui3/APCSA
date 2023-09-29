package Unit2;

import java.util.Scanner;
// import testing.Math;

public class U2_L8_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer:");
        int num1 = scanner.nextInt();
        num1++;
        for (int i=0; i<=2; i++){
            System.out.println((int)(num1*Math.random())+2);
        }
        scanner.close();
    }
}
