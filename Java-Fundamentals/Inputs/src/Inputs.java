import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String name;
        byte age;


        System.out.println("What is your name?");
        name = entry.nextLine();

        System.out.println("How old are you?");
        age = (byte)entry.nextInt();

        System.out.println("Hi " + name + "!, the next year you will have " + (age+1) + " years old");



    }

    public static void format() {

        double x = 10000.0;
        System.out.printf("%1.2f",x/3);

    }

    public static void format_2() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num1 = entry.nextDouble();

        System.out.print("The square root of " + num1 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num1));

    }
}
