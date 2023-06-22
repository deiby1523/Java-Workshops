import java.util.Scanner;

public class Exercise_3 {
    /*

    A consignee offers vehicles for sale with financing plans of up to 48 months, for which a down
    payment of 25% is requested. The remaining amount is subject to an interest rate of 30% overall
    for the loan. Create a code that allows you to obtain and print the value of the down payment
    and the and the monthly payments, given the value of the vehicle.

     */

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double vehicleValue;
        byte numberMonthlyPayments; // Byte, because the maximum number of monthly payments is 48.
        double downPayment;
        double monthlyPayment;

        System.out.println("Entry the value of the vehicle:");
        vehicleValue = entry.nextDouble();
        do {
        System.out.println("Entre the number of monthly payments (Max 48):");
        numberMonthlyPayments = entry.nextByte();
            if (numberMonthlyPayments > 48 || numberMonthlyPayments < 1) {
                System.out.println("Number of monthly payments incorrect!");
            }
        } while (numberMonthlyPayments > 48 || numberMonthlyPayments < 1);

        downPayment = vehicleValue * 0.25;
        monthlyPayment = (vehicleValue - downPayment) / numberMonthlyPayments;

        System.out.println("The down payment is $" + downPayment + "\n" + numberMonthlyPayments +" monthly payments of $" + monthlyPayment);

        entry.close();
    }
}
