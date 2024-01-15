package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L2_Activity_Two {

    public static int highestNum(ArrayList<Integer> arrayList) {
        int highest = arrayList.get(0);

        for (Integer num : arrayList) {
            if (num > highest) {
                highest = num;
            }
        }

        return highest;
    }

}
