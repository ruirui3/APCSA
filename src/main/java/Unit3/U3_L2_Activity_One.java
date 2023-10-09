package Unit3;

import java.util.Scanner;

public class U3_L2_Activity_One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers");
        double[] nums = new double[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextDouble();
        }

        double average = 0.0;

        for (int i = 0; i < 5; i++) {
            average += nums[i];
        }

        average /= 5;
        
        if (average>=89.95){
            System.out.println("ABOVE AVERAGE");
        }
        
        scanner.close();
    }
}
