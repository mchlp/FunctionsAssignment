import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArcTest {
    @Test
    public void testGetFunctionValue() {
        Arc arc = new Arc(10, 3, 2);
        assertEquals(12.0, arc.getFunctionValue(3), FunctionsTests.DOUBLE_TOLERANCE);
        assertEquals(2, arc.getFunctionValue(13), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Arc arc = new Arc(10, 3, 2);
        assertEquals(0.100503782, arc.derivative(2), FunctionsTests.DOUBLE_TOLERANCE);
        assertEquals(0, arc.derivative(3), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Arc arc = new Arc(10, 3, 2);
        assertEquals("√(10.000^2 - (x - 3.000)^2) + 2.000", arc.toString());
        arc = new Arc(10, -3, -2);
        assertEquals("√(10.000^2 - (x + 3.000)^2) - 2.000", arc.toString());
    }
}