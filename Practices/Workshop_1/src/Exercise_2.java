import java.util.Scanner;

public class Exercise_2 {
    /*

    Create a code that allows the director of a company to calculate the new salary of an employee.
    taking into account that the increase must be made according to the increase authorized by the
    state for the current year(16%). Print the current salary, the value of the increase and the new salary.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double salary;
        double increment;
        double newSalary;

        System.out.println("Enter the employee salary");
        salary = entry.nextDouble();

        increment = salary * 0.16;
        newSalary = salary + increment;

        System.out.println( "The employee's current salary is $" + salary + "\n" +
                            "The increment is $" + increment + "\n" +
                            "The employee's new salary is $" + newSalary);

        entry.close();
    }
}
