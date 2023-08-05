package person;

public class Person {

    /*
    |--------------------------------------------------------------------------
    | Attributes
    |--------------------------------------------------------------------------
    */
    private String firstName;
    private String lastName;

    /*
    |--------------------------------------------------------------------------
    | Constructors
    |--------------------------------------------------------------------------
    */

    public Person() {

    }

    /*
    |--------------------------------------------------------------------------
    | getters and setters
    |--------------------------------------------------------------------------
    */

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
    |--------------------------------------------------------------------------
    | Methods
    |--------------------------------------------------------------------------
    */

    public void displayInformation() {
        System.out.println("firstName = " + this.firstName + " lastName = " + this.lastName);
    }
}
