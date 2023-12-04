package Unit6;

// Have to get rid of package statement

public class U6_L2_Activity_Three {

    public static int numDivisible(int num, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % num == 0) {
                count++;
            }
        }

        return count;
    }

}
