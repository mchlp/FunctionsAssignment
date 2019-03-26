/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * An abstract class to be implemented by functions which represents the basic components present in every function.
 * It includes a domain, name, colour, as well as abstract methods to be implemented by child classes.
 */

public abstract class Function {

    public static final String TO_STRING_NUMBER_FORMAT = "%.3f";

    private Domain domain;
    private String name;
    private Colour colour;

    protected Function(double x1, double x2) {
        this.colour = new Colour(0);
        this.name = "";
        setDomain(x1, x2);
    }

    protected Function(double x1, double x2, boolean includex1, boolean includex2) {
        this.colour = new Colour(0);
        this.name = "";
        setDomain(x1, x2, includex1, includex2);
    }

    protected static String formatNumber(double num, boolean reverseSign) {
        return String.format("%c " + TO_STRING_NUMBER_FORMAT, (num >= 0 == reverseSign) ? '-' : '+', Math.abs(num));
    }

    // Returns NaN if undefined, otherwise calls getFunctionValue in child class
    public double value(double x) {
        if (!undefined(x)) {
            return getFunctionValue(x);
        }
        return Double.NaN;
    }

    // To be called by class internally
    protected abstract double getFunctionValue(double x);

    // Returns NaN if undefined, otherwise calls getDerivativeValue in child class
    public double derivative(double x) {
        if (!undefined(x)) {
            return getDerivativeValue(x);
        }
        return Double.NaN;
    }

    // To be called by class internally
    protected abstract double getDerivativeValue(double x);

    public abstract String toString();

    public void setDomain(double x1, double x2) {
        setDomain(x1, x2, x1 != Double.NEGATIVE_INFINITY && x1 != Double.POSITIVE_INFINITY, x2 != Double.NEGATIVE_INFINITY && x2 != Double.POSITIVE_INFINITY);
    }

    public void setDomain(double x1, double x2, boolean includex1, boolean includex2) {
        this.domain = new Domain(x1, x2, includex1, includex2);
    }

    public double getStartDomain() {
        return domain.getStart();
    }

    public double getEndDomain() {
        return domain.getEnd();
    }

    public boolean undefined(double x) {
        return !(this.domain.inDomain(x) && Double.isFinite(getFunctionValue(x)));
    }

    public int getColour() {
        return this.colour.getRGB();
    }

    public void setColour(int colour) {
        this.colour = new Colour(colour);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
