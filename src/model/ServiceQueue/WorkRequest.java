/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import model.Customer.Customer;
import model.Delivery.DeliveryMan;
import model.Person.Person;
import model.FoodCatering.Restaurant;
import java.util.Date;

/**
 *
 * @author karth
 */
public abstract class WorkRequest {

    private String message;
    private Person person;
    private Customer customer;
    private Restaurant restaurant;
    private DeliveryMan deliverMan;
    private String status;
    private Date requestDate;
    private Date resolveDate;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public DeliveryMan getDeliverMan() {
        return deliverMan;
    }

    public void setDeliverMan(DeliveryMan deliverMan) {
        this.deliverMan = deliverMan;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
