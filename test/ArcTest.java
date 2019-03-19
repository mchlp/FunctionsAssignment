import org.junit.Test;

import static org.junit.Assert.*;

public class ArcTest {
    @Test
    public void testGetFunctionValue() {
        Arc arc = new Arc(10, 3, 2);
        assertEquals(12.0, arc.getFunctionValue(3), FunctionsTests.DOUBLE_TOLERANCE);
        assertEquals(2, arc.getFunctionValue(13), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Arc arc = new Arc(2, 5, 3);
        assertEquals(0, arc.derivative(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Arc arc = new Arc(10, 3, 2);
        assertEquals("√(10.000^2 - (x - 3.000)^2) + 2.000", arc.toString());
        arc = new Arc(10, -3, -2);
        assertEquals("√(10.000^2 - (x + 3.000)^2) - 2.000", arc.toString());
    }
}