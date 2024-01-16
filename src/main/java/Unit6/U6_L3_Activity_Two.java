package Unit6;

// Have to get rid of package statement

public class U6_L3_Activity_Two {

    public static void removeVowels(String[] words) {

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                String letter = word.substring(j, j + 1);
                boolean isVowel = letter.toLowerCase().equals("a")
                        || letter.toLowerCase().equals("e")
                        || letter.toLowerCase().equals("i")
                        || letter.toLowerCase().equals("o")
                        || letter.toLowerCase().equals("u");
                if (!isVowel) {
                    System.out.print(letter);
                }
            }
            System.out.println();
        }
    }

}
