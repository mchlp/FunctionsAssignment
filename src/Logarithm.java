/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents a natural logarithmic function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Logarithm extends Function {

    private double a;
    private double b;
    private double x1;

    public Logarithm(double a, double b, double x1) {
        super(a > 0 ? x1 : Double.NEGATIVE_INFINITY, a > 0 ? Double.POSITIVE_INFINITY : x1);
        this.a = a;
        this.b = b;
        this.x1 = x1;
    }

    @Override
    protected double getFunctionValue(double x) {
        return this.a * Math.log(x - this.x1) + this.b;
    }

    @Override
    public double getDerivativeValue(double x) {
        return (this.a) / (x - this.x1);
    }

    @Override
    public String toString() {
        return String.format("%.3fln(x %s) %s", this.a, formatNumber(this.x1, true), formatNumber(this.b, false));
    }
}
