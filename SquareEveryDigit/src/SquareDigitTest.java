import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareDigitTest {
    @Test
    public void test() {
        assertEquals(811181, new SquareDigit().squareDigits(9119));
        assertEquals(444, new SquareDigit().squareDigits(222));
        assertEquals(1, new SquareDigit().squareDigits(-1));
        assertEquals(10925, new SquareDigit().squareDigits(-1035));
        assertEquals(81644936, new SquareDigit().squareDigits(9876));
    }
    
}