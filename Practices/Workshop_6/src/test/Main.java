package test;

import model.Bill;
import model.Phone;
import model.User;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner entry = new Scanner(System.in);

        do {
            System.out.println("Do you want to run the program with predefined data? (Y/N)");
            if (entry.nextLine().equalsIgnoreCase("y")) {
                Phone phone = new Phone("Apple", "Iphone 8 Plus", 3003543513L);
                phone.setLocalMin(60);
                phone.setNationalMin(75);
                phone.setInternationalMin(63);
                User user = new User("Deiby Prada", "Str 22 #8-24", phone, (byte) 3);

                Bill bill = new Bill(user, phone);

                bill.printBill();
            } else {
                User user = new User();
                Phone phone = new Phone();
                System.out.println("Enter the user name: ");
                user.setName(entry.nextLine());
                System.out.println("Enter the user address: ");
                user.setAddress(entry.nextLine());
                System.out.println("Enter the user stratum: ");
                user.setStratum(entry.nextByte());
                System.out.println("Enter the user phone number:");
                phone.setNumber(entry.nextLong());
                System.out.println("How many Local minutes did he use?");
                phone.setLocalMin(entry.nextDouble());
                entry.nextLine();
                System.out.println("How many national minutes of use?");
                phone.setNationalMin(entry.nextDouble());
                entry.nextLine();
                System.out.println("How many international minutes of use?");
                phone.setInternationalMin(entry.nextDouble());
                entry.nextLine();
                Bill bill = new Bill(user, phone);
                System.out.println("\nTotal Payable: " + currency.format(bill.calculateTotalAccrued()));
                System.out.println("\ndo you want to print the bill? (Y/N)");
                if (entry.nextLine().equalsIgnoreCase("y")) {
                    bill.printBill();
                }
            }

            System.out.println("do you want to continue? (Y/N)");

        } while (!entry.nextLine().equalsIgnoreCase("N"));

        System.out.println("\nClosing program...\n");

    }
}
