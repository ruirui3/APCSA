package Unit6;

// Have to get rid of package statement

public class U6_L3_Activity_One {
    public static String findShortest(String[] words) {
        int shortestIndex = 0;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortestLength) {
                shortestIndex = i;
                shortestLength = words[i].length();
            }
        }

        return words[shortestIndex];
    }
}
