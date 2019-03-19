import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CubicTest {
    @Test
    public void testGetFunctionValue() {
        Cubic cubic = new Cubic(7, 2, 5, 3, 2);
        assertEquals(5315, cubic.getFunctionValue(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Cubic cubic = new Cubic(8, 2, 5, 1, 1);
    }

    @Test
    public void test_toString() {
        Cubic cubic = new Cubic(2, 5, 1, 1, 7);
        assertEquals("2.000(x - 7.000)^3 + 5.000(x - 7.000)^2 + 1.000(x - 7.000) + 1.000", cubic.toString());
        cubic = new Cubic(2, -5, -1, 1, 7);
        assertEquals("2.000(x - 7.000)^3 - 5.000(x - 7.000)^2 - 1.000(x - 7.000) + 1.000", cubic.toString());
        cubic = new Cubic(2, 5, 1, -1, -7);
        assertEquals("2.000(x + 7.000)^3 + 5.000(x + 7.000)^2 + 1.000(x + 7.000) - 1.000", cubic.toString());
    }
}