/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Represents a colour by storing RGB values (each one byte) in the left-most three bits of an integer.
 */

public class Colour {

    public static final int RED_MASK = 0xFF000000;
    public static final int GREEN_MASK = 0xFF0000;
    public static final int BLUE_MASK = 0xFF00;

    public static final int RED_SHIFT = 24;
    public static final int GREEN_SHIFT = 16;
    public static final int BLUE_SHIFT = 8;

    private int rgb;

    public Colour(byte red, byte green, byte blue) {
        this.rgb = ((red << RED_SHIFT) & RED_MASK) | ((green << GREEN_SHIFT) & GREEN_MASK) | ((blue << BLUE_SHIFT) & BLUE_MASK);
    }

    public Colour(int rgb) {
        this.rgb = rgb;
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

    public int getRGB() {
        return rgb;
    }
}
