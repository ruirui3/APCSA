package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L4_Activity_One {
    public static int countSecondInitial(ArrayList<String> list, String letter) {
        int count = 0;
        letter = letter.toLowerCase();

        for (String word : list) {
            if (word.substring(1, 2).toLowerCase().equals(letter)) {
                count++;
            }
        }

        return count;

    }
}
