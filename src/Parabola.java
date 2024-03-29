/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents a parabola function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Parabola extends Quadratic {

    private double a;
    private double b;
    private double x1;

    public Parabola(double a, double b, double x1) {
        super(a, -2 * x1 * a, x1 * x1 * a + b, 0);
        this.a = a;
        this.b = b;
        this.x1 = x1;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_NUMBER_FORMAT+"*(x %s)^2 %s", this.a, formatNumber(this.x1, true), formatNumber(this.b, false));
    }
}
