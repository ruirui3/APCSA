package Unit6;

// Have to get rid of package statement

public class U6_L4_Activity_One {

    public static String insert(String[] words, String newWord, int place) {

        if (place < 0 || place > words.length - 1) {
            return "you need a valid number";
        }

        for (int i = words.length - 1; i > place; i--) {
            words[i] = words[i - 1];
        }
        words[place] = newWord;

        String insertedString = "";
        for (int i = 0; i < words.length; i++) {
            insertedString += words[i];
        }

        return insertedString;
    }

}
