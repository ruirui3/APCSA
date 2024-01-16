package Unit6;

// Have to get rid of package statement

public class U6_L5_Activity_Three {
    public static double avg(int[] arr) {
        double s = 0;
        for (double n : arr) {
            s += n;
        }
        s /= arr.length;
        return s;
    }
}
