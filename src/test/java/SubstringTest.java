import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubstringTest {
    @Test
    public void zeroZeroTest(){
        String a="a";
        a=a.substring(0, 0);
        assertTrue(a.equals(""));
    }

    @Test
    public void lengthTest(){
        String a = "012345";
        String segment = "23";
        int index = a.indexOf(segment);
        a = a.substring(0, index)+a.substring(index+segment.length());
        assertTrue(a.equals("0145"));

    }
}