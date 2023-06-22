import java.util.Scanner;

public class Exercise_5 {
    /*

    An electronics store launches a promotional campaign in which it gives a discount on the total purchase value
    according to the number of a die that the customer rolls when paying at the cash register. The value of the
    discount depends on the number of the die rolled and multiply it by 10. Determine the final amount that the
    customer will have to pay for his purchase.

     */
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double purchaseValue;
        byte discount, random;
        double x1, x2, f;

        /*
        Note:   To generate random numbers in a range
                where x1 is the initial range and x2 is the final range [x1,x2]
         */

        x1 = 1;
        x2 = 6;
        f = Math.random()/Math.nextDown(1.0);
        random = (byte)Math.round(x1*(1.0 - f) + x2*f);

        System.out.println("Enter the total amount to pay:");
        purchaseValue = entry.nextDouble();
        System.out.println("Rolls a " + random + " on the die");
        discount = (byte)(random * 10);
        System.out.println("The discount is " + discount+ "%.");
        System.out.println("The total payable is $" + (purchaseValue - (purchaseValue*discount/100)));


        entry.close();
    }
}
