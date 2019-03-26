/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */


/**
 * Represents a cubic function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Cubic extends Function {

    private double a;
    private double b;
    private double c;
    private double d;
    private double x1;

    public Cubic(double a, double b, double c, double d, double x1) {
        super(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.x1 = x1;
    }

    @Override
    protected double getFunctionValue(double x) {
        return (this.a * Math.pow(x - this.x1, 3)) + (this.b * Math.pow(x - this.x1, 2)) + (this.c * (x - this.x1)) + this.c;
    }

    @Override
    public double getDerivativeValue(double x) {
        return (3*this.a*Math.pow(x-this.x1, 2)) + (2*this.b*(x-this.x1)) + this.c;
    }

    @Override
    public String toString() {
        return String.format("%.3f(x %s)^3 %s(x %s)^2 %s(x %s) %s", this.a, formatNumber(this.x1, true), formatNumber(this.b, false), formatNumber(this.x1, true), formatNumber(this.c, false), formatNumber(this.x1, true), formatNumber(this.d, false));
    }
}
