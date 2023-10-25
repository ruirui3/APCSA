package Unit4;

import java.util.Scanner;

public class U4_L1_Activity_One {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num=0;
        System.out.println("Enter any numbers (Enter 5 to stop)");
        int sum=0;
        while (num!=5){
            sum+=num;
            num=scanner.nextInt();
        }

        System.out.println("Sum is "+sum);
        scanner.close();
    }
}
