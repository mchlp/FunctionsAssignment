public class Arc extends Function {

    private double r;
    private double xcenter;
    private double ycenter;

    public Arc (double r, double xcenter, double ycenter) {
        super(xcenter - r, xcenter + r);
        this.r = r;
        this.xcenter = xcenter;
        this.ycenter = ycenter;
    }

    @Override
    public double value(double x) {
        return Math.sqrt(Math.pow(this.r, 2) - Math.pow(x - this.xcenter, 2)) + this.ycenter;
    }

    @Override
    public double derivative(double x) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("√(%.3f^2 - (x - %.3f)^2) + %.3f", this.r, this.xcenter, this.ycenter);
    }
}
