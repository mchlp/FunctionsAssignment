/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
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
    public double derivative(double x) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%.3f(x %s)^2 %s(x %s) %s", this.a, formatNumber(this.x1, true), this.formatNumber(this.b, false), formatNumber(this.x1, true), formatNumber(this.c, false));
    }
}
