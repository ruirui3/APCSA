package Unit4;

import java.util.Scanner;

public class U4_L1_Activity_Two {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int largest=0;
        int num=0;
        while (num!=-1){
            num = scanner.nextInt();
            if(largest<num){
                largest=num;
            }
        }

        System.out.println("The largest score is "+largest);
        scanner.close();
    }
}
