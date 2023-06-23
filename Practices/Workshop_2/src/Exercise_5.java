import java.util.Scanner;

public class Exercise_5 {
    /*

    Develop a code such that given N integers as data, calculate the largest
    and smallest of these numbers. Explain each of the variables used (Cycle For).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int n;
        int largest = 0;
        int smallest = 0;
        int number;

        System.out.println("How many numbers do you want to enter?");
        n = entry.nextInt();


        for (int i = 0; i < n ; i++) {
            System.out.println("Enter the number " + (i+1));
            number = entry.nextInt();
            if (i == 0) {
                smallest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            if (number>largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);


        entry.close();
    }
}
