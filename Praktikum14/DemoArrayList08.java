package Praktikum14;

import java.util.ArrayList;

public class DemoArrayList08 {
    public static void main(String[] args) {

        ArrayList<Customer08> customers = new ArrayList<>();
        Customer08 customer1 = new Customer08(1, "Zakia");
        Customer08 customer2 = new Customer08(5, "Budi");
        customers.add(customer1);
        customers.add(customer2);
        
        customers.add(new Customer08(4, "Cica"));
        
        customers.add(2, new Customer08(100, "Rosa"));
        
        System.out.println (customers.indexOf(customer2));
        
        Customer08 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        
        ArrayList<Customer08> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer08(201, "Della"));
        newCustomers.add(new Customer08(202, "Victor"));
        newCustomers.add(new Customer08(203, "Sarah"));

        customers.addAll(newCustomers);

for (Customer08 cust : customers) {
    System.out.println(cust.toString());
    }

    System.out.println(customers);
    }
}
