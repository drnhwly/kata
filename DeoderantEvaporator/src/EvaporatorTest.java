import static org.junit.Assert.*;
import org.junit.*;

public class EvaporatorTest { 
    @Test
    public void testEvaporatorOne() {
        assertEquals(22 , Evaporator.evaporator(10, 10, 10));     
    }
    @Test
    public void testEvaporatorTwo() {
        assertEquals(1 , Evaporator.evaporator(10, 10, 100));     
    }
}