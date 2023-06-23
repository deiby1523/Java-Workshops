import java.util.Scanner;

public class Exercise_2 {
    /*

    Develop a code for a company that allows you to calculate
    payroll, calculating and displaying on screen the payroll for
    its N employees who must be paid by days worked. If the
    calculated salary is greater than $1,500 give them a 4% bonus
    and if it is less than this value, give them a 6% bonus.
    The value per working day is the same for all. At the end you
    must show the total value of the payroll (Cycle For).

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        int nEmployees;
        int daysWorked;
        double salary;
        double payroll = 0;
        double workingDay$ = 54.5;  // Approximate minimum daily wage in the U.S.

        System.out.println("Enter the number of employees:");
        nEmployees = entry.nextInt();

        for (int i = 1; i <= nEmployees ; i++) {
            System.out.println("Enter the number of days worked by the worker " + i + ":");
            daysWorked = entry.nextInt();
            salary = daysWorked * workingDay$;
            if (salary >= 1500) {
                salary += salary * 0.04;
            } else {
                salary += salary * 0.06;
            }
            payroll += salary;
        }

        System.out.println("The total value of the payroll is $" + payroll);

        entry.close();
    }
}
