package co.com.javaworkshops.test;

import co.com.javaworkshops.sales.Order;
import co.com.javaworkshops.sales.Product;

public class SalesTest {
    public static void main(String[] args) {

        Product product1 = new Product("iPhone 8 plus",400);
        Product product2 = new Product("Samsung monitor",800);
        Product product3 = new Product("RedDragon keyboard NB-681",100);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        order1.addProduct(product3);

        // System.out.println(order1.calculateTotal());

        // Data Output

        order1.showOrder();


    }
}
