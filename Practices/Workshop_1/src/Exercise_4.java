import java.util.Scanner;

public class Exercise_4 {
    /*

    A commercial distribution company gives each employee a seniority bonus based on the number of years worked.
    The Company has a long-service bonus, based on the number of years worked. Each employee will receive a
    percentage of his assigned base salary, as follows:

        - Less than 5 years 3 % of base salary
        - 5 years or more and less than 10 years 5 % of base salary
        - 10 years or more and less than 20 years 10 % of the base salary
        - 20 years or more 20% of the base salary

    Calculate the employee's new salary including the bonus.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double salary, bonus;
        byte yearsWorked;

        System.out.println("Enter the salary of the employee:");
        salary = entry.nextDouble();
        System.out.println("Enter the number of years worked by the employee:");
        yearsWorked = entry.nextByte();

        if (yearsWorked < 5 ) {
            bonus = salary*0.03;
            System.out.println("A $" + (bonus) + " bonus is paid");
        } else if (yearsWorked >= 5 && yearsWorked < 10) {
            bonus = salary * 0.05;
            System.out.println("A $" + (bonus) + " bonus is paid");
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            bonus = salary * 0.1;
            System.out.println("A $" + (bonus) + " bonus is paid");
        } else if (yearsWorked >= 20) {
            bonus = salary * 0.2;
            System.out.println("A $" + (bonus) + " bonus is paid");

        }

        System.out.println("The new Salary of the employee with the bonus is $" + salary);





        entry.close();
    }
}
