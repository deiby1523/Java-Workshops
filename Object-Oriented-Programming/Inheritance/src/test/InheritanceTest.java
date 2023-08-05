package test;

import domain.Customer;
import domain.Employee;

public class InheritanceTest {
    public static void main(String[] args) {
        
        
        Employee employee1 = new Employee("Deiby",1000);
        employee1.setGender('M');
        employee1.setAge((byte)19);
        employee1.setAddress("Unknown Street 21 #321");
        System.out.println("employee1 = " + employee1);
        
        
        Customer customer1 = new Customer("Alejandra",true);
        customer1.setGender('F');
        customer1.setAge((byte)16);
        customer1.setAddress("Unknown Street 12 #123");
        System.out.println("customer1 = " + customer1);
    }
}
