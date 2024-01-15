package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L2_Activity_Three {
    public static ArrayList<Integer> getEvens(ArrayList<Integer> vals) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (Integer num : vals) {
            if (num % 2 == 0) {
                arrayList.add(num);
            }
        }

        return arrayList;
    }
}
