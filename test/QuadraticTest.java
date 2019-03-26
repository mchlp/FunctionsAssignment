import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadraticTest {
    @Test
    public void testGetFunctionValue() {
        Quadratic quadratic = new Quadratic(2, 5, 1, 1);
        assertEquals(251, quadratic.getFunctionValue(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Quadratic quadratic = new Quadratic(2, 5, 1, 1);
        assertEquals(45, quadratic.derivative(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Quadratic quadratic = new Quadratic(2, 5, 1, 1);
        assertEquals("2.000*(x - 1.000)^2 + 5.000*(x - 1.000) + 1.000", quadratic.toString());
        quadratic = new Quadratic(-2, -5, -1, 1);
        assertEquals("-2.000*(x - 1.000)^2 - 5.000*(x - 1.000) - 1.000", quadratic.toString());
        quadratic = new Quadratic(2, 5, 1, -1);
        assertEquals("2.000*(x + 1.000)^2 + 5.000*(x + 1.000) + 1.000", quadratic.toString());
    }
}