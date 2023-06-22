import java.util.Scanner;

public class Exercise_6 {
    /*

    Given three integers, determine if the sum of any pair of them is equal to the third number. If this
    condition is met, write "Equal" and, if not, write "Different".

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int n1,n2,n3;

        System.out.println("Enter the first number:");
        n1 = entry.nextInt();
        System.out.println("Enter the second number:");
        n2 = entry.nextInt();
        System.out.println("Enter the third number:");
        n3 = entry.nextInt();

        if (n1 + n2 == n3) {
            System.out.println("Equal");
        } else if (n3 + n1 == n2) {
            System.out.println("Equal");
        } else if (n2 + n3 == n1) {
            System.out.println("Equal");
        } else {
            System.out.println("Different");
        }



        entry.close();
    }
}
