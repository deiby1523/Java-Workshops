package tests;

import model.Student;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String name;
        byte age;
        double grade;
        boolean repeat = true;
        int studentsCounter = 0;

        while (repeat) {
            System.out.println("Enter the student's data Number " + ++studentsCounter + ":");
            System.out.println("Enter the name: ");
            name = entry.nextLine();
            System.out.println("Enter the age: ");
            age = entry.nextByte();

            Student student = new Student(name,age);

            System.out.println("Enter the first grade: ");
            grade = entry.nextDouble();
            entry.nextLine();
            student.setGrade(0,grade);
            System.out.println("Enter the second grade: ");
            grade = entry.nextDouble();
            entry.nextLine();
            student.setGrade(1,grade);

            System.out.println(student);
            System.out.println("The "+ student.getName() +" average is " + student.calculateAverage());
            System.out.println("The assistance is $" + student.calculateAssistance());

            System.out.println("Do you want to continue? (Y/N)");
            String SN = entry.nextLine();

            if (SN.equalsIgnoreCase("N")) {
                repeat = false;
            }

        }

    }
}
