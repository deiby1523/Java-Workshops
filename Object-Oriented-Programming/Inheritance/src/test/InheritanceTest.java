package test;

import domain.Employee;

public class InheritanceTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Deiby",1000);
        employee1.setGender('M');
        employee1.setAge((byte) 19);
        employee1.setAddress("Unknown Street 21 #321");
        System.out.println("employee1 = " + employee1);
    }
}
