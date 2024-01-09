package Unit7;

// Have to get rid of package statement

import java.util.ArrayList;

public class U7_L5_Activity_Two {

  public static void selectSortReverse(ArrayList<Integer> list) {

    for (int i = 0; i < list.size() - 1; i++) {
      int largestIndex = i;
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(j) > list.get(largestIndex)) {
          largestIndex = j;
        }
      }
      int temp = list.get(i);

      list.set(i, list.get(largestIndex));
      list.set(largestIndex, temp);
    }

    System.out.println(list);

  }

}
