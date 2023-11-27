package Unit5;

// Have to get rid of package statement

public class U5_L4_Activity_Four {

    public static int substringCount(String str, String subStr) {
        int lenSubStr = subStr.length();
        int count = 0;
        for (int i = 0; i < str.length() - lenSubStr + 1; i++) {
            if (str.substring(i, i + lenSubStr).equals(subStr)) {
                count++;
            }
        }

        return count;
    }
    /*
     * public static void main(String[] args) {
     * System.out.println(substringCount("aabbababaa", "a"));
     * }
     */
}
