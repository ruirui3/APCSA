package Unit4;

import java.util.Scanner;

public class U4_L2_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if(num1%2==0){
            num1++;
        }

        while(num1<=num2){
            System.out.println(num1);
            num1+=2;
        }

        scanner.close();
    }
}
