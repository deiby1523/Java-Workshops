import java.util.Scanner;

public class Exercise_6 {
    /*

    Develop an algorithm that allows to simulate the coin game (faces or stamps), as many times
    as the user wants to repeat the game. At the end show the statistics of how many times it was
    played, how many faces and how many stamps were generated. ( While Cycle ).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        boolean repeat = true;
        String option;
        int faces = 0;
        int stamps = 0;
        int games = 0;

        System.out.println("\n--- The Coin Game ---\n");

        while (repeat) {
            int coin;
            double f = Math.random()/Math.nextDown(1.0);
            byte x1 = 1;
            byte x2 = 2;
            coin = (int)Math.round(x1*(1.0 - f) + x2*f);

            if (coin == 1) {
                System.out.println("\nExit face\n");
                faces++;
            } else {
                System.out.println("\nExit stamp\n");
                stamps++;
            }

            System.out.println("Do you want to continue playing?(Y/N)");
            option = entry.next();
            if (!option.equalsIgnoreCase("y")) {
                repeat = false;
            }
            games++;
        }

        System.out.println("\nGames: " + games + "\nFaces: " + faces + "\nStamps: " + stamps + "\n");



        entry.close();
    }
}
