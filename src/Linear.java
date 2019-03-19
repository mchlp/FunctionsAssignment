/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
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
    public double derivative(double x) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%.3f(x %s) %s", this.m, formatNumber(this.x1, true), formatNumber(this.b, false));
    }
}