/*
 * Author: Michael Pu
 * Teacher: Mr. Radulovic
 * Date: 2019/3/18
 * Course: ICS4U
 */

public class FunctionTester {

    public static void main(String[] args) {
        Logarithm logarithm = new Logarithm(2, 3, 1);
        System.out.println(logarithm);
        System.out.println(logarithm.undefined(0.999));
    }

}
