import java.util.Scanner;

public class Exercise_2 {
    /*

    Given two vectors of integer type A and B, construct a program that calculates the
    product of each of the vector positions and stores the result in a new vector C.

     */
    @SuppressWarnings("StringOperationCanBeSimplified")
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int n;

        System.out.println("Enter the vector size:");   //  We ask the user for the length of the array
        n = entry.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {  //   We iterate N times to go through the array positions and add values
            System.out.println("Enter the number A[" + (i) + "]:");
            vectorA[i] = entry.nextInt();
            System.out.println("Enter the number B[" + (i) + "]:");
            vectorB[i] = entry.nextInt();
        }


        //  We multiply each element of the vectors and store the result in another vector

        for (int i = 0; i < n; i++) {
            results[i] = vectorA[i] * vectorB[i];
        }


        // Finally, we print the vectors and the new vector with the results
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0 -> {
                    for (int j = 0; j < n; j++) {
                        System.out.print("[" + vectorA[j] + "]");
                    }
                    System.out.println("");
                    for (int j = 0; j < n; j++) {
                        System.out.print(" ↓ ");
                    }
                    System.out.println("");
                }
                case 1 -> {
                    for (int j = 0; j < n; j++) {
                        System.out.print("[" + vectorB[j] + "]");
                    }
                    System.out.println("");
                    for (int j = 0; j < n; j++) {
                        System.out.print("===");
                    }
                    System.out.println("");
                }
                case 2 -> {
                    for (int j = 0; j < n; j++) {
                        System.out.print("[" + results[j] + "]");
                    }
                    System.out.println("");
                }
            }
        }


        entry.close();
    }
}
