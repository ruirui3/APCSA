package Unit4;

public class U4_FRQ {
    public static void main(String[] args) {
        longestStreak("CCCCCCAAAAATTT!!!!!!!");
    }

    public static void longestStreak(String str) {

        int longestStreak = 1;
        int curStreak = 1;
        String longestLetter = str.substring(0, 1);

        for (int i = 1; i < str.length(); i++) {
            String curLetter = str.substring(i, i + 1);
            String prevLetter = str.substring(i - 1, i);

            if (curLetter.equals(prevLetter)) {
                curStreak++;
            } else {
                curStreak = 1;
            }

            if (curStreak > longestStreak) {
                longestStreak = curStreak;
                longestLetter = prevLetter;
            }

        }

        System.out.println(longestLetter + " " + longestStreak);
    }
}
