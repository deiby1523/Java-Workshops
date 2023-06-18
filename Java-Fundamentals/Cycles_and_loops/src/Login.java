import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        String password = "deiby123";
        String input;

        do {    // Execute this line of code at least once, even if the condition is false.
            System.out.println("\nEnter the password:");
            input = entry.nextLine();
            if (!password.equals(input)) {
                System.out.println("Incorrect password!");
            }
        } while (!password.equals(input));  // Evaluates if the password provided is the same as the correct one.

        System.out.println("Correct password! access allowed");


        entry.close();  // It is good practice to close the data entry.
    }
}
