public class Domain {

    private double start;
    private double end;
    private boolean includeStart;
    private boolean includeEnd;

    public Domain() {
        this(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, false, false);
    }

    public Domain(double start, double end, boolean includeStart, boolean includeEnd) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
        this.includeStart = includeStart;
        this.includeEnd = includeEnd;
    }

    public boolean inDomain(int check) {
        return (check >= start && check <= end);
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public boolean isIncludeStart() {
        return includeStart;
    }

    public boolean isIncludeEnd() {
        return includeEnd;
    }
}
