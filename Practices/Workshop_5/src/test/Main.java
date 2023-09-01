package test;

import model.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int objectsCounter = 0;

        while (true) {
            Employee employee = new Employee();
            System.out.println("Enter the Employee's data Number " + ++objectsCounter + ":");
            System.out.println("Enter the name: ");
            employee.setName(entry.nextLine());
            System.out.println("Enter the age: ");
            employee.setAge(entry.nextByte());
            System.out.println("Enter the Base salary: ");
            employee.setWage(entry.nextDouble());
            entry.nextLine();
            System.out.println("Enter the days worked by the employee");
            employee.setDaysWorked(entry.nextByte());
            entry.nextLine();

            employee.response();

            System.out.println("Do you want to continue? (Y/N)");
            String SN = entry.nextLine();

            if (SN.equalsIgnoreCase("N")) {
                break;
            }

        }
    }
}
