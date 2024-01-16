package Unit7;

import java.util.ArrayList;
import java.util.Scanner;

public class U7_L1_Activity_One {
    public static void main(String[] args) {
        System.out.println("Please enter words, enter STOP to stop the loop.");

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            arrayList.add(input);
            input = scanner.nextLine();
        }

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        if (arrayList.size() > 2) {
            String temp = arrayList.get(0);
            arrayList.set(0, arrayList.get(arrayList.size() - 1));
            arrayList.set(arrayList.size() - 1, temp);
            arrayList.remove(0);
        }

        System.out.println(arrayList);

        scanner.close();

    }
}
