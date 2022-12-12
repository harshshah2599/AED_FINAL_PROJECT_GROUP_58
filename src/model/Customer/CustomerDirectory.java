/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Customer;

import model.Customer.GeneralInformation;
import java.util.ArrayList;

/**
 *
 * @author karth
 */

// a new array list will store the customer details as and when a customer registers. CRUD operations can be performed on registered persons
public class CustomerDirectory {
    ArrayList<Customer> customers;
    public  CustomerDirectory()
    {
        this.customers=new ArrayList<>();
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public void addcustomer(Customer customer) {
        this.customers.add(customer);
    }
    public void removeCustomer(Customer customer){
        this.customers.remove(customer);
    }
}
