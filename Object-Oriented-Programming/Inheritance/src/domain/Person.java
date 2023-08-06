package domain;

public class Person {

    /**
     * |--------------------------------------------------------------------------
     * | attributes
     * |--------------------------------------------------------------------------
     * <ul>
     *     <li>
     *         Private attributes are not inherited to child classes
     *     </li>
     *     <br>
     *     <li>
     *         The constructors are not inherited, but we can access them through the word super
     *     </li>
     * </ul>
     */

    protected String name;
    protected char gender;
    protected byte age;
    protected String address;

    /**
     * |--------------------------------------------------------------------------
     * | constructors
     * |--------------------------------------------------------------------------
     */

    public Person() {
        // super();
    }

    public Person(String name) {
        this();     // First the empty constructor creates the object and then its attributes are initialized.
        this.name = name;
    }

    public Person(String name, char gender, byte age, String address) {
        this();     // First the empty constructor creates the object and then its attributes are initialized.
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    /**
     * |--------------------------------------------------------------------------
     * | getters and setters
     * |--------------------------------------------------------------------------
     */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", address='").append(address).append('\'');
        sb.append(", memoryAddress=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
