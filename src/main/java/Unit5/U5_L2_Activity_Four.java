package Unit5;

// Have to get rid of package statement

public class U5_L2_Activity_Four {
    public static void coinConverter(int cents) {
        int dollars = cents / 100;
        cents %= 100;
        int quarters = cents / 25;
        cents %= 25;
        int dimes = cents / 10;
        cents %= 10;
        int nickels = cents / 5;
        cents %= 5;
        int pennies = cents;

        System.out.println("Dollar Bills: " + dollars + "\r\n" + //
                "Quarters: " + quarters + "\r\n" + //
                "Dimes: " + dimes + "\r\n" + //
                "Nickels: " + nickels + "\r\n" + //
                "Pennies: " + pennies);

    }

    // public static void main(String[] args) {
    // coinConverter(1234);
    // }
}
