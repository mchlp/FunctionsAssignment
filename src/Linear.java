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
    public double value(double x) {
        if (!undefined(x)) {
            return (this.m * (x - this.x1)) + this.b;
        }
        return Double.NaN;
    }

    @Override
    public double derivative(double x) {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%.3f(x - %.3f) + %.3f", this.m, this.x1, this.b);
    }
}