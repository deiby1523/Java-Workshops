import java.util.Scanner;

public class Exercise_1 {
    /*

    Create a code that, given two integers as data, calculates the addition, subtraction and multiplication
    of these numbers. At the end print the answers indicating each operation.

     */

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int num1,num2;

        System.out.println("Enter number 1:");
        num1 = entry.nextInt();
        System.out.println("Enter number 2:");
        num2 = entry.nextInt();

        System.out.println( "Addition: " + (num1 + num2) + "\n" +
                            "Subtraction: " + (num1 - num2) + "\n" +
                            "Multiplication: " + (num1 * num2));

        entry.close();
    }
}
