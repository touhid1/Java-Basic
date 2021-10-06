public class MathClass {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z = -10;

        // Returns the greater of two int values.
        int maximum = Math.max(x, y);
        System.out.println("Maximum is : " + maximum);

        // Returns the smaller of two int values.
        int minimum = Math.min(x, y);
        System.out.println("Maximum is : " + minimum);

        // Returns the absolute value of a int value.
        int Absolute = Math.abs(z);
        System.out.println("Maximum is : " + Absolute);

        // Returns the value of the first argument raised to the power of the second
        // argument.
        double power = Math.pow(x, y);
        System.out.println("Power is :" + power);

        // Returns the closest long to the argument, with ties rounding to positive
        // infinity.
        int round = Math.round(8.9f);
        System.out.println("Round is :" + round);

        // The double value that is closer than any other to pi, the ratio of the
        // circumference of a circle to its diameter.
        System.out.println(Math.PI);

    }
}
