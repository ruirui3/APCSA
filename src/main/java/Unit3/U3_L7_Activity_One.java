package Unit3;

import java.util.Scanner;

public class U3_L7_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (password.equals("bulbasaur")) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
        
        scanner.close();
    }
}
