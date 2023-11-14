
public class DuplicateCheck {
    public static boolean hasDuplicate(String s) {
        for (int i = 0; i < s.length(); i++) {
            String curLetter = s.substring(i, i + 1);
            for (int j = i + 1; j < s.length(); j++) {
                if (curLetter.equals(s.substring(j, j + 1))) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate("null")); // true
        System.out.println(hasDuplicate("abc")); // false
        System.out.println(hasDuplicate("abca")); // true
        System.out.println(hasDuplicate("llun")); // true
        String funstr = "~!@#$%^&*()_+`1234567890-=qwertyuiop[]\"QWERTYUIOP{}asdfghjkl;'ASDFGHJKL:zxcvbnm,./ZXCVBNM<>?";
        System.out.println(hasDuplicate(funstr)); // false
    }
}
