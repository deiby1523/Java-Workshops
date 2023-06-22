import java.util.Scanner;

public class Exercise_1 {
    /*

    create a code that allows to read N positive numbers, add them and
    display the result, at the end it shows on the screen the amount of
    numbers reads, the result of the sum and the average of all the
    numbers. To exit the  program enter a value less than zero, Cycle While).

     */

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int N;
        double num;
        double sum = 0;
        int i = 0;

        System.out.println("How many numbers do you want to add?");
        N = entry.nextInt();

        while (i < N) {
            System.out.println("Enter number " + (i+1) + ":");
            num = entry.nextDouble();
            sum += num;
            i++;
        }

        System.out.println("The sum total of the " + N + " numbers is: " + sum);





        entry.close();
    }
}
