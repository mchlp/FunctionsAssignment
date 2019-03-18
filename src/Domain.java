public class Domain {

    private int start;
    private int end;
    private boolean allRealNumbers;

    public Domain() {
        this.allRealNumbers = true;
    }

    public Domain(int start, int end) {
        this.start = Math.min(start, end);
        this.end = Math.max(start, end);
        this.allRealNumbers = false;
    }

    public boolean inDomain(int check) {
        return (check >= start && check <= end);
    }

}
