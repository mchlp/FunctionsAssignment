import org.junit.Test;

import static org.junit.Assert.*;

public class LinearTest {
    @Test
    public void testGetFunctionValue() {
        Linear linear = new Linear(10, 3, 2);
        assertEquals(133, linear.getFunctionValue(15), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Linear linear = new Linear(2, 5, 3);
        assertEquals(0, linear.derivative(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Linear linear = new Linear(3, 5, 3);
        assertEquals("3.000(x - 3.000) + 5.000", linear.toString());
        linear = new Linear(2, 5, -5);
        assertEquals("2.000(x + 5.000) + 5.000", linear.toString());
    }
}