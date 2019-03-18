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

    public abstract double value(double x);

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
        boolean insideStart;
        boolean insideEnd;

        if (domain.isIncludeStart()) {
            insideStart = domain.getStart() <= x;
        } else {
            insideStart = domain.getStart() < x;
        }

        if (domain.isIncludeEnd()) {
            insideEnd = domain.getEnd() >= x;
        } else {
            insideEnd = domain.getEnd() > x;
        }

        return !(insideStart && insideEnd);
    }

    public void setColour(int colour) {
        this.colour = new Colour(colour);
    }

    public int getColour() {
        return this.colour.getRGB();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
