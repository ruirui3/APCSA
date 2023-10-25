package Unit4;

import java.util.Scanner;

public class U4_L1_Activity_Three {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a word:");
        String word =scanner.nextLine();

        int index=0;
        while (index<word.length()){
            
            if((index+1)%3!=0 && index<word.length()){
                System.out.print(word.substring(index, index+1));
            }

            index++;
        }

        scanner.close();
    }
}
