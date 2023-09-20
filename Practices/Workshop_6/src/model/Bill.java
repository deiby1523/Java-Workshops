package model;

import java.text.NumberFormat;
import java.util.Date;

public class Bill {
    /**
     * |--------------------------------------------------------------------------
     * | Constants
     * |--------------------------------------------------------------------------
     */

    private final static Double valueStratum1 = 15000.0;
    private final static Double valueStratum2 = 20000.0;
    private final static Double valueStratum3 = 30000.0;
    private final static Double valueMinInterNa = 2700.0;
    private final static Double ValueMinNational = valueMinInterNa / 3;
    private final static Double ValueMinLocal = 0.0;
    /**
     * |--------------------------------------------------------------------------
     * | attributes
     * |--------------------------------------------------------------------------
     */

    private static int BILL_COUNTER;

    /**
     |--------------------------------------------------------------------------
     | InitializationBlocks
     |--------------------------------------------------------------------------
     */

    static {
        Bill.BILL_COUNTER = 0;
    }

    private final int idBill;
    private final Date date;
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    private User user;
    private Phone phone;

    {
        this.idBill = ++BILL_COUNTER;
        this.date = new Date();
    }

    /**
     * |--------------------------------------------------------------------------
     * | constructors
     * |--------------------------------------------------------------------------
     */
    public Bill(User user, Phone phone) {
        this.user = user;
        this.phone = phone;
    }

    /**
     * |--------------------------------------------------------------------------
     * | getters and setters
     * |--------------------------------------------------------------------------
     */
    public int getIdBill() {
        return idBill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    /**
     * |--------------------------------------------------------------------------
     * | methods
     * |--------------------------------------------------------------------------
     */

    public double calculateBasicCharge() {

        switch (this.user.getStratum()) {
            case 1 -> {
                return Bill.valueStratum1;
            }
            case 2 -> {
                return Bill.valueStratum2;
            }
            case 3 -> {
                return Bill.valueStratum3;
            }
            default -> {
                System.out.println("Incorrect stratum");
                return 0;
            }
        }

    }

    public double calculateLocalMinutes() {
        double min = this.phone.getLocalMin();
        return (min * Bill.ValueMinLocal);
    }

    public double calculateNationalMinutes() {
        double min = this.phone.getNationalMin();
        if (min >= 50) {
            min -= 50;
            return (min * Bill.ValueMinNational);
        } else {
            return 0;
        }
    }

    public double calculateInternationalMinutes() {
        double min = this.phone.getInternationalMin();
        if (min >= 50) {
            min -= 50;
            return (min * Bill.valueMinInterNa);
        } else {
            return 0;
        }
    }

    public double calculateIVA() {
        double additionalMin = calculateInternationalMinutes() + calculateNationalMinutes();
        return additionalMin * 0.16;
    }

    public double calculateTotalAccrued() {
        double total = 0;
        total += this.calculateBasicCharge();
        total += this.calculateLocalMinutes();
        total += this.calculateNationalMinutes();
        total += this.calculateInternationalMinutes();
        total += this.calculateIVA();
        return total;
    }

    public void printBill() {
        System.out.println("\nTelebucaramanga S.A         | " + "\tBill #" + this.getIdBill());
        System.out.println("NIT: 1.102.349.527-D        | " + "\tDate: " + this.date.getDate() + "/" + (this.date.getMonth() + 1) + "/" + (this.date.getYear() - 100));
        System.out.println("State: Bogota        | " + "\tCustomer: " + this.user.getName());
        System.out.println("Address: Cra 19B #4-56    | " + "\tStratum: " + this.user.getStratum());
        System.out.println("phone: 3112278543        | " + "\tBilled Line: " + this.phone.getNumber());
        System.out.println("\n\t\t\t\tDescription:");
        System.out.println("Basic Charge ....................... " + currency.format(this.calculateBasicCharge()));
        System.out.println("Local Minutes .................... " + String.format("%.0f", this.phone.getLocalMin()) + " minutes = " + currency.format(this.calculateLocalMinutes()));
        System.out.println("National Minutes ................. " + String.format("%.0f", this.phone.getNationalMin()) + " minutes = " + currency.format(this.calculateNationalMinutes()));
        System.out.println("International Minutes ............ " + String.format("%.0f", this.phone.getInternationalMin()) + " minutes = " + currency.format(this.calculateInternationalMinutes()));
        System.out.println("Total Minutes                        " + currency.format(this.calculateLocalMinutes() + this.calculateNationalMinutes() + this.calculateInternationalMinutes()));
        System.out.println("IVA ................................ " + currency.format(this.calculateIVA()));
        System.out.println("\nTotal Payable:                        " + currency.format(this.calculateTotalAccrued()));
    }


}