package Unit3;

import java.util.Scanner;

public class U3_L1_Activity_Four {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an Integer:");
        int x = scan.nextInt();
        if (x%2==0) {
            System.out.println("Divisible by 2!");
        }
        if (x%3==0) {
            System.out.println("Divisible by 3!");
        }
        scan.close();

    }
}