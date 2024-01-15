package Unit7;

// Have to get rid of package statement

public class U7_L5_Activity_One {
    public static void sortAndPrintReverse(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int high = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[high]) > 0) {
                    high = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[high];
            arr[high] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
