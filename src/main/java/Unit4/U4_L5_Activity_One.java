package Unit4;

import java.util.Scanner;

public class U4_L5_Activity_One {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input a String");
    String word = scanner.nextLine();
    System.out.println("Input an Inteager");
    int times = scanner.nextInt();

    for (int i = 0; i < word.length(); i++) {
      for (int j = 0; j < times; j++) {
        System.out.print(word.substring(i, i + 1));
      }
    }
    scanner.close();

  }
}