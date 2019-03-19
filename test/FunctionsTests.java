import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        QuadraticTest.class,
        LinearTest.class,
        ArcTest.class
})

public class FunctionsTests {
    public static final double DOUBLE_TOLERANCE = 0.0001;
}
