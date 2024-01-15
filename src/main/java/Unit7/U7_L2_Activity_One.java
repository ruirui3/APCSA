package Unit7;

import java.util.ArrayList;
import java.util.Scanner;

public class U7_L2_Activity_One {
    public static void main(String[] args) {
        System.out.println("Please enter words, enter STOP to stop the loop.");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            arrayList.add(input);
            input = scanner.nextLine();
        }

        System.out.println(arrayList);

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i) + arrayList.get(arrayList.size() - i - 1));
        }

        scanner.close();
    }
}
