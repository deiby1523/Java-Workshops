import java.util.Scanner;

public class EvaluateAge {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Please enter your age:");
        byte age = entry.nextByte();

        if (age >= 18) {
            System.out.println("You are of legal age");
        } else {
            System.out.println("You are not of legal age");
        }

        entry.close();
    }

    public static void EvaluateAge2() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please enter your age:");
        byte age = entry.nextByte();

        if ( age <= 18 ) {
            System.out.println("You are young");
        } else if ( age <= 40 ) {
            System.out.println("You are an adult");
        } else if ( age <= 60 ) {
            System.out.println("You are mature");
        } else {
            System.out.println("Take care of yourself!");
        }

        entry.close();
    }
}
