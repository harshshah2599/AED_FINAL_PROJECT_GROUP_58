/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Delivery;

import model.EmpRole.DeliverManRole;
import model.UserAccount.UserAccount;

/**
 *
 * @author aditi
 */


public class DeliveryMan {
    private String name;
    private int deliveryManId;

    
    private boolean isDeliveryPersonAvailable=true;
    private String deliveryManGender;

    public void setDeliveryManGender(String deliveryManGender) {
        this.deliveryManGender = deliveryManGender;
    }

    
    public boolean isIsDeliveryPersonAvailable() {
        return isDeliveryPersonAvailable;
    }
    
    public String getDeliveryManGender() {
        return deliveryManGender;
    }

    
    public void setIsDeliveryPersonAvailable(boolean isDeliveryPersonAvailable) {
        this.isDeliveryPersonAvailable = isDeliveryPersonAvailable;
    }
    public String getName() {
        return name;
    }
    
    public void setDeliveryManId(int deliveryManId) {
        this.deliveryManId = deliveryManId;
    }

    public int getDeliveryManId() {
        return deliveryManId;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        if(name == null){
            return "";
        }
        return this.name;
    }

    public int getUniqueId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
