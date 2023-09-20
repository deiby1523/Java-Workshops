package model;

public class User {
    /**
     * |--------------------------------------------------------------------------
     * | attributes
     * |--------------------------------------------------------------------------
     */
    private static int USER_COUNTER;

    /**
     |--------------------------------------------------------------------------
     | Initialization Blocks
     |--------------------------------------------------------------------------
     */

    static {
        User.USER_COUNTER = 0;
    }

    private final int idUser;
    private String name;
    private String address;
    private Phone phone;
    private byte stratum;

    {
        this.idUser = ++User.USER_COUNTER;
    }

    /**
     * |--------------------------------------------------------------------------
     * | constructors
     * |--------------------------------------------------------------------------
     */

    public User() {

    }

    public User(String name, String address, Phone phone, byte stratum) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.stratum = stratum;
    }

    /**
     * |--------------------------------------------------------------------------
     * | getters and setters
     * |--------------------------------------------------------------------------
     */
    public int getIdUser() {
        return this.idUser;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Phone getPhone() {
        return this.phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public byte getStratum() {
        return this.stratum;
    }

    public void setStratum(byte stratum) {
        this.stratum = stratum;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */


}