package Unit3;

import java.util.Scanner;

public class U3_L4_Activity_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the latitude:");
        double latitude = scanner.nextDouble();
        System.out.println("Please enter the longitude:");
        double longitude = scanner.nextDouble();

        boolean isLatitudeWithinBounds = (latitude >= -90.0 && latitude <= 90.0);
        boolean isLongitudeWithinBounds = (longitude >= -180.0 && longitude <= 180.0);

        if (!isLatitudeWithinBounds) {
            System.out.println("latitude is incorrect");
        }
        if (!isLongitudeWithinBounds) {
            System.out.println("longitude is incorrect");
        }
        if (isLatitudeWithinBounds && isLongitudeWithinBounds) {
            System.out.println("The location: " + latitude + ", " + longitude);
        }

        scanner.close();
    }
}
