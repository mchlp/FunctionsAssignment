/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents a quadratic function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Quadratic extends Function {

    private double a;
    private double b;
    private double c;
    private double x1;

    public Quadratic(double a, double b, double c, double x1) {
        super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
    }

    @Override
    protected double getFunctionValue(double x) {
        return (this.a * Math.pow(x - this.x1, 2)) + (this.b * (x - this.x1)) + this.c;
    }

    @Override
    public double getDerivativeValue(double x) {
        return 2 * this.a * (x - this.x1) + this.b;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_NUMBER_FORMAT+"*(x %s)^2 %s*(x %s) %s", this.a, formatNumber(this.x1, true), formatNumber(this.b, false), formatNumber(this.x1, true), formatNumber(this.c, false));
    }
}
