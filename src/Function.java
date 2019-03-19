/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
 */

public abstract class Function {
    private Domain domain;
    private String name;
    private Colour colour;

    protected Function(double x1, double x2) {
        setDomain(x1, x2);
    }

    protected Function(double x1, double x2, boolean includex1, boolean includex2) {
        setDomain(x1, x2, includex1, includex2);
    }

    protected static String formatNumber(double num, boolean reverseSign) {
        return String.format("%c %.3f", (num >= 0 == reverseSign) ? '-' : '+', Math.abs(num));
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

    public abstract double derivative(double x);

    public abstract String toString();

    public void setDomain(double x1, double x2) {
        this.domain = new Domain(x1, x2, true, true);
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
        return this.domain.inDomain(x);
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
