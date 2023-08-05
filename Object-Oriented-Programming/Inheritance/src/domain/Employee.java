package domain;

public class Employee extends Person {

    /**
     * |--------------------------------------------------------------------------
     * | attributes
     * |--------------------------------------------------------------------------
     */
    private final int idEmployee;
    private double salary;
    private static int employeeCounter;

    /**
     * |--------------------------------------------------------------------------
     * | constructors
     * |--------------------------------------------------------------------------
     */

    public Employee(String name, double salary) {
        super(name);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    public Employee(String name, char gender, byte age, String address, double salary) {
        super(name, gender, age, address);
        this.idEmployee = ++Employee.employeeCounter;
        this.salary = salary;
    }

    /**
     * |--------------------------------------------------------------------------
     * | getters and setters
     * |--------------------------------------------------------------------------
     */

    public int getIdEmployee() {
        return idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * |--------------------------------------------------------------------------
     * | methods
     * |--------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("idEmployee=").append(idEmployee);
        sb.append(", salary=$").append(salary).append('}');
        sb.append(" ").append(super.toString());
        return sb.toString();
    }
}
