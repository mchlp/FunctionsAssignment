import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogarithmTest {
    @Test
    public void testGetFunctionValue() {
        Logarithm logarithm = new Logarithm(5, 5, 2);
        assertEquals(16.9894763, logarithm.getFunctionValue(13), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Logarithm logarithm = new Logarithm(2, 5, 3);
        assertEquals(0.25, logarithm.derivative(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Logarithm logarithm = new Logarithm(3, 5, 3);
        assertEquals("3.000*ln(x - 3.000) + 5.000", logarithm.toString());
        logarithm = new Logarithm(2, 5, -5);
        assertEquals("2.000*ln(x + 5.000) + 5.000", logarithm.toString());
    }
}