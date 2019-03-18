public class Colour {

    public static final int RED_MASK = 0xFF0000;
    public static final int GREEN_MASK = 0xFF00;
    public static final int BLUE_MASK = 0xFF;

    public static final int RED_SHIFT = 16;
    public static final int GREEN_SHIFT = 8;
    public static final int BLUE_SHIFT = 0;

    private int rgb;

    public Colour(byte red, byte green, byte blue) {
        this.rgb = ((red << RED_SHIFT) & RED_MASK) | ((green << GREEN_SHIFT) & GREEN_MASK) | ((blue << BLUE_SHIFT) & BLUE_MASK);
    }

    public byte getRed() {
        return (byte) ((rgb & RED_MASK) >> (RED_SHIFT));
    }

    public byte getGreen() {
        return (byte) ((rgb & GREEN_MASK) >> (GREEN_SHIFT));
    }

    public byte getBlue() {
        return (byte) ((rgb & BLUE_MASK) >> (BLUE_SHIFT));
    }
}
