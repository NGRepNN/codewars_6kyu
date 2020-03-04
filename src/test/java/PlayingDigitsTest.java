import static org.junit.Assert.*;
import org.junit.Test;
public class PlayingDigitsTest {
    @Test
    public void Test1() {
        assertEquals(1, PlayingDigits.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, PlayingDigits.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, PlayingDigits.digPow(46288, 3));
    }
}
