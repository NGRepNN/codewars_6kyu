import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class MobileDisplayTest {
    @Test
    public void testSomeValues1() {
        String solution = "***************************\n*                         *\n*                         *\n*                         *\n*        CodeWars         *\n*                         *\n*                         *\n*                         *\n*                         *\n* Menu           Contacts *\n***************************";
        assertEquals(solution, MobileDisplay.mobileDisplay(27,41));
    }

    @Test
    public void testSomeValues2() {
        String solution = "************************************\n*                                  *\n*                                  *\n*                                  *\n*             CodeWars             *\n*                                  *\n*                                  *\n*                                  *\n*                                  *\n* Menu                    Contacts *\n************************************";
        assertEquals(solution, MobileDisplay.mobileDisplay(36,31));
    }
}
