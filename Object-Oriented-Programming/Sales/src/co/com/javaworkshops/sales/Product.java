package co.com.javaworkshops.sales;

public class Product {
    /**
     |--------------------------------------------------------------------------
     | attributes
     |--------------------------------------------------------------------------
     */

    private final int productId;
    private String name;
    private double price;
    private static int productCounter;

    /**
     |--------------------------------------------------------------------------
     | constructors
     |--------------------------------------------------------------------------
     */

    public Product() {
        this.productId = ++Product.productCounter;
    }

    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }

    /**
     |--------------------------------------------------------------------------
     | getters and setters
     |--------------------------------------------------------------------------
     */
    public int getProductId() {
        return this.productId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("productId=").append(productId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
