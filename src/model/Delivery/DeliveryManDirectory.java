/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Delivery;

import model.FoodCatering.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */


public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryMens;
    public  DeliveryManDirectory()
    {
        this.deliveryMens=new ArrayList<>();
    }
    public ArrayList<DeliveryMan> getDeliveryMens() {
        return deliveryMens;
    }

    public void setDeliveryMens(DeliveryMan deliveryMan) {
        this.deliveryMens.add(deliveryMan);
    }
}
