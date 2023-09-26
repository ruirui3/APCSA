// Just some practice with .compareTo method of String class

import org.junit.Test;

public class CompareToTest {
    @Test
    public void main(String[] args) {
        String a = "gene";
        String b = "deter";
        String c = "remedy";
        String d = "chocolate";
        String e = "supress";

        String[] o = { a, b, c, d, e };
        
        for (int i = 0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.println(o[i].compareTo(o[j]));
            }
        }
        // 0
        // positive
        // negative
        // etc.

    }
}
