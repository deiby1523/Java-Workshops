import java.util.Scanner;

public class Exercise_3 {
    /*

    Design a program to perform the following operations with vectors in order:
        a. Record in a vector A, 15 integers.
        b. Each value stored in the vector A multiplies it by a constant value typed by the user and stores it in a vector B.
        c. In a vector C, it stores the result of the subtraction of vector B minus vector A.
        d. Finally, it displays the contents of the three vectors A, B and C.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int[] vectorA = new int[15];
        int[] vectorB = new int[15];
        int[] vectorC = new int[15];
        int k;

        for (int i = 0; i < 15 ; i++) {
            System.out.println("Enter the number " + (i+1) + ":");
            vectorA[i] = entry.nextInt();
        }

        System.out.println("Enter a constant value for multiplying the vector");
        k = entry.nextInt();

        for (int i = 0; i < 15 ; i++) {
            vectorB[i] = vectorA[i] * k;
            vectorC[i] = vectorB[i] - vectorA[i];
        }

        System.out.println("\nVector A");
        for (int i = 0; i < 15; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("\nVector B");
        for (int i = 0; i < 15; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("\nVector C");
        for (int i = 0; i < 15; i++) {
            System.out.print("[" + vectorC[i] + "]");
        }



        entry.close();
    }
}
