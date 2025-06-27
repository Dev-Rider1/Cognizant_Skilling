import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    public void testMultiply() {
        MathUtils math = new MathUtils();
        assertEquals(20, math.multiply(4, 5));
        assertNotEquals(15, math.multiply(3, 6));
    }
}