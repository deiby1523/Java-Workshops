package co.com.javaworkshops.sales;

public class Order {
    /**
     |--------------------------------------------------------------------------
     | attributes
     |--------------------------------------------------------------------------
     */

    private final int orderId;
    private final Product[] products;
    private byte productCounter = 0;
    private static int orderCounter;
    private static final byte MAX_PRODUCTS = 10;

    /**
     |--------------------------------------------------------------------------
     | constructors
     |--------------------------------------------------------------------------
     */

    public Order() {
        this.orderId = ++Order.orderCounter;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    /**
     |--------------------------------------------------------------------------
     | methods
     |--------------------------------------------------------------------------
     */

    public void addProduct(Product product) {
        if (productCounter < 10) {
            this.products[productCounter++] = product;
        } else {
            System.out.println("You can not add more products to the order, maximum " + Order.MAX_PRODUCTS);
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : this.products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Order id : " + this.orderId);
        System.out.println("\tid \tproduct \tprice");
        for (Product product : this.products) {
            if (product != null) {
                System.out.println("\t" + product.getProductId() + "\t" + product.getName() + "\t$" + product.getPrice());
            }
        }
        System.out.println("\t\t\t Total:        $" + this.calculateTotal());
    }


}
