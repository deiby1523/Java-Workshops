import java.util.Scanner;

public class Exercise_4 {
    /*

    Design an algorithm that allows to register in vectors the name and weight in KG of
    each player of the UTS soccer team, at the end calculate and display the average
    weight of all players, which is the heaviest (name and weight) and the least heavy
    (name and weight).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int nPlayers;
        double sumWeights = 0;
        double average;
        double heaviest = 0;
        int heaviestPos = 0;
        double leastHeavy = 0;
        int leastHeavyPos = 0;

        System.out.println("Enter the number of players on the UTS soccer team");
        nPlayers = entry.nextInt();

        String[] names = new String[nPlayers];
        double[] weights = new double[nPlayers];

        for (int i = 0; i < nPlayers ; i++) {
            System.out.println("Enter the name of the player " + (i+1) + ":");
            names[i] = entry.next();
        }

        for (int i = 0; i < nPlayers; i++) {
            System.out.println("Enter the weight of " + names[i] + ":");
            weights[i] = entry.nextDouble();
            sumWeights += weights[i];

            if (i == 1) {
                leastHeavy = weights[i];
                leastHeavyPos = i;
            }

            if (weights[i] < leastHeavy) {
                leastHeavy = weights[i];
                leastHeavyPos = i;
            }

            if (weights[i] > heaviest) {
                heaviest = weights[i];
                heaviestPos = i;
            }

        }

        average = sumWeights / nPlayers;

        System.out.print("The average weight of the players is ");
        System.out.println(String.format("%1.2f",average) + "Kg.");
        System.out.println("The heaviest is " + names[heaviestPos] + " with " + heaviest + "Kg.");
        System.out.println("The least heavy is " + names[leastHeavyPos] + " with " + leastHeavy + "Kg.");



        entry.close();  // It is a good practice to close the data entry.
    }
}
