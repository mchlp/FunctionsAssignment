/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/25
 * Course: ICS4U
 */

/**
 * Class to test function classes.
 */

public class FunctionTester {

    public static void main(String[] args) {

        System.out.println("Linear");
        Linear linear = new Linear(2, 3, 5);
        System.out.println("To String: " + linear.toString());
        System.out.println("Colour: " + linear.getColour());
        System.out.println("Start Domain: " + linear.getStartDomain());
        System.out.println("End Domain: " + linear.getEndDomain());
        System.out.println("Name: " + linear.getName());
        System.out.println("Value at x=3: " + linear.value(3));
        System.out.println("Derivative Value at x=3: " + linear.derivative(3));

        System.out.println();

        System.out.println("Parabola");
        Parabola parabola = new Parabola(2, 3, 2);
        System.out.println("To String: " + parabola.toString());
        System.out.println("Colour: " + parabola.getColour());
        System.out.println("Start Domain: " + parabola.getStartDomain());
        System.out.println("End Domain: " + parabola.getEndDomain());
        System.out.println("Name: " + parabola.getName());
        System.out.println("Value at x=3: " + parabola.value(3));
        System.out.println("Derivative Value at x=3: " + parabola.derivative(3));

        System.out.println();

        System.out.println("Arc");
        Arc arc = new Arc(4, -5, -2);
        System.out.println("To String: " + arc.toString());
        System.out.println("Colour: " + arc.getColour());
        System.out.println("Start Domain: " + arc.getStartDomain());
        System.out.println("End Domain: " + arc.getEndDomain());
        System.out.println("Name: " + arc.getName());
        System.out.println("Value at x=3: " + arc.value(-5));
        System.out.println("Derivative Value at x=3: " + arc.derivative(-5));

        System.out.println();

        System.out.println("Quadratic");
        Quadratic quadratic = new Quadratic(0.25, -0.5, -1.0, -2);
        System.out.println("To String: " + quadratic.toString());
        System.out.println("Colour: " + quadratic.getColour());
        System.out.println("Start Domain: " + quadratic.getStartDomain());
        System.out.println("End Domain: " + quadratic.getEndDomain());
        System.out.println("Name: " + quadratic.getName());
        System.out.println("Value at x=3: " + quadratic.value(3));
        System.out.println("Derivative Value at x=3: " + quadratic.derivative(3));

        System.out.println();

        System.out.println("Cubic");
        Cubic cubic = new Cubic(0.35, 0.25, -0.5, -1.0, 2);
        System.out.println("To String: " + cubic.toString());
        System.out.println("Colour: " + cubic.getColour());
        System.out.println("Start Domain: " + cubic.getStartDomain());
        System.out.println("End Domain: " + cubic.getEndDomain());
        System.out.println("Name: " + cubic.getName());
        System.out.println("Value at x=3: " + cubic.value(3));
        System.out.println("Derivative Value at x=3: " + cubic.derivative(3));

        System.out.println();

        System.out.println("Logarithm");
        Logarithm logarithm = new Logarithm(-2, -10, -3);
        System.out.println("To String: " + logarithm.toString());
        System.out.println("Colour: " + logarithm.getColour());
        System.out.println("Start Domain: " + logarithm.getStartDomain());
        System.out.println("End Domain: " + logarithm.getEndDomain());
        System.out.println("Name: " + logarithm.getName());
        System.out.println("Value at x=3: " + logarithm.value(3));
        System.out.println("Derivative Value at x=3: " + logarithm.derivative(3));

    }

}
