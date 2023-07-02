import java.util.Scanner;

public class Exercise_6 {
    /*

    Write a program to sum the values contained in
    the main diagonal of a square matrix.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        byte n;
        int sum = 0;

        System.out.println("Enter the number of rows and columns of the square matrix:");
        n = entry.nextByte();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value for Matrix [" + (i+1) + "][" + (j+1) + "]:");
                matrix[i][j] = entry.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if ( i == j) {
                   sum += matrix[i][j];
               }
            }
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ matrix[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("The sum of the main diagonal is " + sum);




        entry.close();
    }
}
