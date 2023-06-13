public class MathClass {

    public static void main(String[] args) {

        // The Math class contains a set of methods that allow us to perform mathematical calculations.
        //      Math.sqrt(n): Square Root of a Number
        //      Math.pow(Base, Exponent): Power of a number, base and exponent are doubles

        // Trigonometric Ratios
        //      Math.sin(Angle)
        //      Math.cos(Angle)
        //      Math.tan(Angle)

        // Math.round(decimal): Rounding of a number

        // Math.PI: Class constant with PI number

        int root = (int)Math.sqrt(9);
        System.out.println("The square root of 9 is " + root);

        double num1 = 5.85;
        int result = (int)Math.round(num1); // Re-founding or Casting: Used to convert data types (Only if the data is allowed by the new type)
        System.out.println(num1 + " rounded -> " + result);


        int base = 5;
        int exponent = 2;
        int result2 = (int) Math.pow(base,exponent);
        System.out.println("The result of " + base + " raised to " + exponent + " is " + result2);


    }
}
