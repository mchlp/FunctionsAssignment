/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
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
    public double derivative(double x) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%.3f(x %s)^3 + %.3f(x %s)^2 + %.3f(x %s) %s", this.a, formatNumber(this.x1, true), this.b, formatNumber(this.x1, true), this.c, formatNumber(this.x1, true), formatNumber(this.d, false));
    }
}
