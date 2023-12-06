
public class ArrayAlgorithms {

    public static void shift(int[] list) {
        int first = list[0];
        for (int i = 0; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }
        list[list.length - 1] = first;

    }

    public static void insert(int[] list, int val, int loc) {
        for (int i = list.length - 1; i > loc; i--) {
            list[i] = list[i - 1];
        }
        list[loc] = val;

    }

    public static void reverse(int[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            int temp = list[i];
            int j = list.length - 1 - i;
            list[i] = list[j];
            list[j] = temp;
        }

    }

    public static void delete(int[] list, int index) {
        for (int i = index; i < list.length - 1; i++) {
            list[i] = list[i + 1];
        }

    }

}
