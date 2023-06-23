import java.util.Scanner;

public class Exercise_4 {
    /*

    Develop a code that allows a user to generate the multiplication table he
    wants to know and to repeat this operation as many times as tables he wants to
    see on the screen (Cycle While - Cycle For).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int table;
        int multiply;


        do {
                System.out.println("Enter the number to multiply (Enter '0' to exit):");
                table = entry.nextInt();

                if (table != 0) {

                    System.out.println("Up to where you want to multiply " + table);
                    multiply = entry.nextInt();

                    for (int i = 1; i <= multiply; i++) {
                        System.out.println(table + " x " + i + " = " + (table*i));
                    }

                }


        } while (table != 0);



        entry.close();
    }
}
