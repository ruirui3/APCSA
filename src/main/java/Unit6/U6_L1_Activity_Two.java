package Unit6;

// Have to get rid of package statement

import java.util.Scanner;

public class U6_L1_Activity_Two {
    public static void main(String[] args) {

        int[] h = new int[10];

        h[0] = 1;
        h[1] = h[0] + 2;
        h[2] = h[1] + 3;
        h[3] = h[2] + 4;
        h[4] = h[3] + 5;
        h[5] = h[4] + 6;
        h[6] = h[5] + 7;
        h[7] = h[6] + 8;
        h[8] = h[7] + 9;
        h[9] = h[8] + 10;

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i > 0 && i <= 10)
            System.out.println(h[i - 1]);

        scan.close();
    }
}
