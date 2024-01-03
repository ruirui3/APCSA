package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L3_Activity_One {
    public static void shiftLeft(ArrayList<String> arrayList){
        arrayList.add(arrayList.get(0));
        arrayList.remove(0);
    }
}
