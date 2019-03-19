/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
 */

public class Domain {

    private double start;
    private double end;
    private boolean includeStart;
    private boolean includeEnd;

    public Domain(double start, double end, boolean includeStart, boolean includeEnd) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
        this.includeStart = includeStart;
        this.includeEnd = includeEnd;
    }

    public boolean inDomain(double check) {
        boolean insideStart;
        boolean insideEnd;

        if (isIncludeStart()) {
            insideStart = getStart() <= check;
        } else {
            insideStart = getStart() < check;
        }

        if (isIncludeEnd()) {
            insideEnd = getEnd() >= check;
        } else {
            insideEnd = getEnd() > check;
        }

        return !(insideStart && insideEnd);
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
