
public class ArrayAlgorithms {

    public static int[] shift(int[] list) {
        int first = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        list[list.length - 1] = first;

        return list;

    }

    public static int[] insert(int[] list, int val, int loc) {
        for (int i = list.length - 1; i > loc; i--) {
            list[i] = list[i - 1];
        }
        list[loc] = val;

        return list;

    }

    public static int[] reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            int j = list.length - 1 - i;
            list[i] = list[j];
            list[j] = temp;
        }

        return list;

    }

    public static int[] delete(int[] list, int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }

        return list;

    }

}
