package Unit4;

import java.util.Scanner;

public class U4_L1_5_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int index=0;
        int sum=0;
        while (index<n){
            index++;
            sum+=index;
        }

        System.out.println(sum);
        scanner.close();
    }
}
