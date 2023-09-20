package model;

public class Phone {
    /**
     |--------------------------------------------------------------------------
     | attributes
     |--------------------------------------------------------------------------
     */
    private static int PHONE_COUNTER;

    /**
     |--------------------------------------------------------------------------
     | Initialization Blocks
     |--------------------------------------------------------------------------
     */
    static {
        Phone.PHONE_COUNTER = 0;
    }

    private final int idPhone;
    private String brand;
    private String model;
    private long number;
    private double localMin;
    private double nationalMin;
    private double internationalMin;

    {
        this.idPhone = ++Phone.PHONE_COUNTER;
    }

    /**
     |--------------------------------------------------------------------------
     | constructors
     |--------------------------------------------------------------------------
     */

    public Phone() {

    }

    public Phone(String brand, String model, long number) {
        this.brand = brand;
        this.model = model;
        this.number = number;
    }

    /**
     |--------------------------------------------------------------------------
     | getters and setters
     |--------------------------------------------------------------------------
     */

    public int getIdPhone() {
        return this.idPhone;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getLocalMin() {
        return this.localMin;
    }

    public void setLocalMin(double localMin) {
        this.localMin = localMin;
    }

    public double getNationalMin() {
        return this.nationalMin;
    }

    public void setNationalMin(double nationalMin) {
        this.nationalMin = nationalMin;
    }

    public double getInternationalMin() {
        return this.internationalMin;
    }

    public void setInternationalMin(double internationalMin) {
        this.internationalMin = internationalMin;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    public void callLocal(double min) {
        this.localMin += min;
    }

    public void callNational(double min) {
        this.nationalMin += min;
    }

    public void callInternational(double min) {
        this.internationalMin += min;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone [");
        sb.append("IdPhone=").append(idPhone);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", number=").append(number);
        sb.append(", localMin=").append(localMin);
        sb.append(", NationalMin=").append(nationalMin);
        sb.append(", InternationalMin=").append(internationalMin);
        sb.append(']');
        return sb.toString();
    }
}
