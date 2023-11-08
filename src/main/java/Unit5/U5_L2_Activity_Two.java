package Unit5;

// Have to get rid of package statement

public class U5_L2_Activity_Two {
    public static void reverser(String word) {

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.substring(i, i + 1));
        }
    }

    // public static void main(String[] args) {
    //     reverser("abcde");
    // }
}
