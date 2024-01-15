package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L3_Activity_Two {
    public static void printStatistics(ArrayList<Integer> arrayList) {
        int sum = 0;
        double average;
        int highestAppearances = 0;
        int mostAppearedNum = 0;
        int otherhighestAppearances = 0;

        for (Integer num : arrayList) {
            int appearances = 0;
            sum += num;
            for (Integer i : arrayList) {
                if (num == i) {
                    appearances++;
                }
            }
            if (appearances > highestAppearances) {
                highestAppearances = appearances;
                mostAppearedNum = num;
            } else if (mostAppearedNum != num && appearances == highestAppearances) {
                otherhighestAppearances = appearances;
            }
        }

        average = (double) sum / arrayList.size();
        String mode = "";

        if (highestAppearances == otherhighestAppearances) {
            mode = "no single mode";
        } else {
            mode += mostAppearedNum;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Mode: " + mode);

    }

    // public static void main(String[] args) {
    //     ArrayList<Integer> arrayList = new ArrayList<>();

    //     arrayList.add(1);
    //     arrayList.add(5);
    //     arrayList.add(9);
    //     arrayList.add(5);
    //     arrayList.add(1);

    //     printStatistics(arrayList);
    // }
}
