package Unit6;

// Have to get rid of package statement

public class U6_L3_Activity_Three {

    public static void printUn(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (word.length() > 2 && word.substring(0, 2).equals("un")) {
                System.out.println(arr[i]);
            }
        }
    }

}
