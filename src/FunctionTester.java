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

        Linear linear = new Linear(1, 0, 0);


        Parabola parabola = new Parabola(1, 0, 0);



        Arc arc = new Arc(4, 0, -2);

        Quadratic quadratic = new Quadratic(0.25, -0.5, -1.0, 0);

        Cubic cubic = new Cubic(0.35, 0.25, -0.5, -1.0, 2);

        Logarithm logarithm = new Logarithm(1, 0, 0);

    }

}
