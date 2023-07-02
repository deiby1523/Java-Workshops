import java.util.Scanner;

public class Exercise_5 {
    /*

    Given two two-dimensional arrays A (m X n) and B (m X n), make a program that
    computes the sum of arrays A and B and stores its new result in array C (m X n).

     */
    @SuppressWarnings("StringOperationCanBeSimplified")
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        byte m,n;

        System.out.println("Enter the number of rows:");
        m = entry.nextByte();
        System.out.println("Enter the number of Columns:");
        n = entry.nextByte();

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];
        int[][] matrixC = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value for Matrix A [" + (i+1) + "][" + (j+1) + "]:");
                matrixA[i][j] = entry.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value for Matrix B [" + (i+1) + "][" + (j+1) + "]:");
                matrixB[i][j] = entry.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ matrixA[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ matrixB[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("["+ matrixC[i][j] + "]");
            }
            System.out.println("");
        }




        entry.close();
    }
}

