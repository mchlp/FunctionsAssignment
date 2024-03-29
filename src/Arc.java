/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents an arc function with parameters and methods to calculate the value of the function and its derivative at a point.
 */

public class Arc extends Function {

    private double r;
    private double ycenter;
    private double xcenter;

    public Arc(double r, double xcenter, double ycenter) {
        super(xcenter - r, xcenter + r);
        this.r = r;
        this.xcenter = xcenter;
        this.ycenter = ycenter;
    }

    @Override
    protected double getFunctionValue(double x) {
        return Math.sqrt(Math.pow(this.r, 2) - Math.pow(x - this.xcenter, 2)) + this.ycenter;
    }

    @Override
    public double getDerivativeValue(double x) {
        return -(x - this.xcenter) * Math.pow((this.r * this.r) - Math.pow(x - this.xcenter, 2), -0.5);
        //return -(x - this.xcenter) * Math.pow(Math.pow(x - this.xcenter, 2) - (this.r * this.r), -0.5); // one given on classroom
    }

    @Override
    public String toString() {
        return String.format("√(" + TO_STRING_NUMBER_FORMAT + "^2 - (x %s)^2) %s", this.r, formatNumber(this.xcenter, true), formatNumber(this.ycenter, false));
    }
}
