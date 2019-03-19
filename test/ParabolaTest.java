import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParabolaTest {
    @Test
    public void testGetFunctionValue() {
        Parabola parabola = new Parabola(2, 5, 1);
        assertEquals(205, parabola.getFunctionValue(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void derivative() {
        Parabola parabola = new Parabola(2, 5, 1);
        assertEquals(0, parabola.derivative(11), FunctionsTests.DOUBLE_TOLERANCE);
    }

    @Test
    public void test_toString() {
        Parabola parabola = new Parabola(2, 5, 1);
        assertEquals("2.000(x - 1.000)^2 + 5.000", parabola.toString());
        parabola = new Parabola(2, -5, -1);
        assertEquals("2.000(x + 1.000)^2 - 5.000", parabola.toString());
    }
}