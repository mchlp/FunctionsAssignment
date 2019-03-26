/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents a linear function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Linear extends Function {

    private double m;
    private double b;
    private double x1;

    public Linear(double m, double b, double x1) {
        super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        this.m = m;
        this.b = b;
        this.x1 = x1;
    }

    @Override
    protected double getFunctionValue(double x) {
        return (this.m * (x - this.x1)) + this.b;
    }

    @Override
    public double getDerivativeValue(double x) {
        return m;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_NUMBER_FORMAT + "*(x %s) %s", this.m, formatNumber(this.x1, true), formatNumber(this.b, false));
    }
}