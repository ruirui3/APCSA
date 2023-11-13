
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringParameterTest {

    public void modifyString(String a) {
        a = "b";
    }

    public String returnString(String a) {
        a = "b";
        return a;
    }

    @Test
    public void strTest() {
        String string = "abcde";
        modifyString(string);
        assertTrue(string.equals("abcde"));

        string = returnString(string);
        assertTrue(string.equals("b"));

    }

}
