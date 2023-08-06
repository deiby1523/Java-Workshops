package domain;

import java.util.Date;

public class Customer extends Person {

    /**
     |--------------------------------------------------------------------------
     | attributes
     |--------------------------------------------------------------------------
     */
    private final int idCustomer;
    private static int customerCounter;
    private final Date registrationDate;
    private boolean vip;

    /**
     |--------------------------------------------------------------------------
     | constructors
     |--------------------------------------------------------------------------
     */

    public Customer() {
        this.idCustomer = ++Customer.customerCounter;
        this.registrationDate = new Date();
    }

    public Customer(String name, boolean vip) {
        this();
        this.name = name;
        this.vip = vip;
    }

    /**
     |--------------------------------------------------------------------------
     | getters and setters
     |--------------------------------------------------------------------------
     */

    public int getIdCustomer() {
        return this.idCustomer;
    }

    public Date getRegistrationDate() {
        return this.registrationDate;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Customer{");
        sb.append("idCustomer=").append(idCustomer);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", vip=").append(vip).append('}');
        sb.append(" ").append(super.toString());
        return sb.toString();
    }


}
