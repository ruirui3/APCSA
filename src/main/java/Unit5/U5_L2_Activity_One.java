package Unit5;

// Have to get rid of package statement

public class U5_L2_Activity_One {
    public static void timeOfDay(int hour) {
        if (hour == 0) {
            System.out.println("midnight");
        } else if (hour < 12) {
            System.out.println("morning");
        } else if (hour == 12) {
            System.out.println("noon");
        } else if (hour < 18) {
            System.out.println("afternoon");
        } else if (hour == 18) {
            System.out.println("dusk");
        } else if (hour < 24) {
            System.out.println("evening");
        }
    }

    // public static void main(String[] args) {

    // }
}
