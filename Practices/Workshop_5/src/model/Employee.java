package model;

public class Employee {
    /**
     * |--------------------------------------------------------------------------
     * | attributes
     * |--------------------------------------------------------------------------
     */
    public static final double MINIMUM_WAGE = 1_160_000;
    public static final double TRANSPORTATION_AID = 140_606;
    private static int EMPLOYEE_COUNTER = 0;
    private final int id;
    private String name;
    private byte age;
    private double wage;
    private byte daysWorked;

    /**
     * |--------------------------------------------------------------------------
     * | constructors
     * |--------------------------------------------------------------------------
     */
    public Employee() {
        this.id = ++Employee.EMPLOYEE_COUNTER;
    }

    public Employee(String name, byte age, double wage,byte daysWorked) {
        this();
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.daysWorked = daysWorked;
    }

    /**
     * |--------------------------------------------------------------------------
     * | getters and setters
     * |--------------------------------------------------------------------------
     */

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public byte getDaysWorked() {
        return this.daysWorked;
    }

    public void setDaysWorked(byte daysWorked) {
        this.daysWorked = daysWorked;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    public double calculateWageDays() {
        return (this.wage * this.daysWorked)/30;
    }

    public double calculateTransportationAid() {
        if (this.wage <= (Employee.MINIMUM_WAGE*2)) {
            return Employee.TRANSPORTATION_AID;
        } else {
            return 0;
        }
    }

    public double calculateInsurance() {
        return this.calculateWageDays() * 0.08;
    }

    public double calculateTotalAccrued() {
        return this.calculateWageDays() + calculateTransportationAid() - calculateInsurance();
    }

    public void response() {
        final StringBuilder sb = new StringBuilder("Employee #" + this.id + " " + this.name + "\n");
        sb.append("Salary for days worked during the month: $").append(this.calculateWageDays() + "\n");
        sb.append("Transportation aid: ").append(this.calculateTransportationAid() > 0 ? "Yes - $" + Employee.TRANSPORTATION_AID : "No").append("\n");
        sb.append("Insurance: $").append(this.calculateInsurance()).append("\n");
        sb.append("Total Accrued: $").append(this.calculateTotalAccrued());
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee[");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", wage=").append(wage);
        sb.append(']');
        return sb.toString();
    }
}
