import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int random;
        byte number;
        byte attempts = 0;

        random = (int)Math.round(Math.random()*100);    //The random method generates a double number between 0 and 1.

        /*

        Note:   To generate random numbers in a range

            where x1 is the initial range and x2 is the final range [x1,x2]

            double f = Math.random()/Math.nextDown(1.0);
            double x = x1*(1.0 - f) + x2*f;


         */

        System.out.println("Guess the number from 0 to 100");

        do {
            System.out.println("Enter a number:");
            number = entry.nextByte();
            attempts++;
            if (number > random ) {
                System.out.println("Lower!");
            } else if (number < random ) {
                System.out.println("Higher!");
            }
        } while (number != random);

        System.out.println("You guessed it, Congratulations!");
        System.out.println("You had " + attempts + " attempts.");




        entry.close();
    }
}
