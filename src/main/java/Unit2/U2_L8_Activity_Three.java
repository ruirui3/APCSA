package Unit2;

import java.util.Scanner;

public class U2_L8_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two doubles:");
        System.out.print(">");
        double num1= scanner.nextDouble();
        System.out.print(">");
        double num2= scanner.nextDouble();

        int difference = (int) Math.round(Math.abs(num2-num1));
        
        System.out.println("Difference: "+difference);
        scanner.close();
    }
}
