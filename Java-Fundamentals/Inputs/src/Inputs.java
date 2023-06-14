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

        System.out.println("Hi " + name + "!, you have " + age + " years old");

    }
}
