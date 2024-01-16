package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L4_Activity_Two {
    public static int searchSecond(ArrayList<String> list, String target) {
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                if (count == 0) {
                    count++;
                } else if (count == 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
