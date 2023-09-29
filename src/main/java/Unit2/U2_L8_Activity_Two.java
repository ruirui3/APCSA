package Unit2;

import java.util.Scanner;

public class U2_L8_Activity_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first x-coordinate:");
        Double x1 = scanner.nextDouble();
        System.out.println("Enter the second x-coordinate:");
        Double x2 = scanner.nextDouble();
        System.out.println("Enter the first y-coordinate:");
        Double y1 = scanner.nextDouble();
        System.out.println("Enter the second y-coordinate:");
        Double y2 = scanner.nextDouble();

        double slope = (y2 - y1) / (x2 - x1);
        System.out.println("Slope: " + slope);

        scanner.close();
    }
}
