import java.util.Scanner;

public class FiguresArea {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        byte option;    //      It is recommended to declare variables at the beginning of the program
        double result;  //      for a more understandable code.


        //  Options printout
        System.out.println("This java algorithm is designed to calculate the area of some figures.");
        System.out.println("Choose an option: \n1.Square\n2.Rectangle\n3.Triangle\n4.Circle");
        option = entry.nextByte();


        // Note: In IntelliJ type the abbreviation 'option.switch'

        switch (option) {
            case 1 -> { // Square calculations
                double side;
                System.out.println("Enter the length of a side of the square");
                side = entry.nextDouble();
                result = Math.pow(side, 2);
            }
            case 2 -> { // Rectangle calculations
                double length;
                double width;
                System.out.println("Enter the length of the rectangle");
                length = entry.nextDouble();
                System.out.println("Enter the width of the rectangle");
                width = entry.nextDouble();
                result = length * width;
            }
            case 3 -> { // Triangle calculations
                double base;
                double height;
                System.out.println("Enter the base of the triangle");
                base = entry.nextDouble();
                System.out.println("Enter the height of the triangle");
                height = entry.nextDouble();
                result = (base * height) / 2;
            }
            case 4 -> { // Circle calculations
                double radius;
                System.out.println("Enter the radius of the circle");
                radius = entry.nextDouble();
                result = Math.PI * (Math.pow(radius, 2));
            }
            default -> {
                System.out.println("The option is not correct");
                result = 0;
            }
        }


        // Print response
        System.out.println("result = " + String.format("%1.2f",result));



        entry.close();   // It is important to close the data entry to avoid inconveniences later on.
    }
}
