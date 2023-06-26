import java.util.Scanner;

public class Exercise_1 {
    /*

    Design a program that, given as input a one-dimensional array (vector) of
    integers, obtains as output the sum of each of the elements of the vector or array.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int n;
        int sum = 0;


        System.out.println("Enter the vector size:");   //  We ask the user for the length of the array
        n = entry.nextInt();

        int[] numbers = new int[n]; //  Create the array of N integers

        for (int i = 0; i < n ; i++) {  //   We iterate N times to go through the array positions and add values
            System.out.println("Enter the number " + (i+1) + ":");
            numbers[i] = entry.nextInt();
        }

        for (int i = 0; i < n ; i++) {  //   We use another FOR loop to sum up the array
            sum += numbers[i];
        }

        System.out.println("The sum of the array numbers is: " + sum);


        entry.close();
    }
}
