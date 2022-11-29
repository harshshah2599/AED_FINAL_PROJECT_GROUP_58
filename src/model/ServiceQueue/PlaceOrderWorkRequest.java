/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.ServiceQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author karth
 */
public class PlaceOrderWorkRequest extends WorkRequest {
     public PlaceOrderWorkRequest() {
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    private String id;

    public String getId() {
        return id;
    }
    public List<Cart> getItemsWithQuatityList() {
        return itemsWithQuatityList;
    }

    public void setItemsWithQuatityList(Cart itemsWithQuatityList) {
        this.itemsWithQuatityList.add(itemsWithQuatityList);
    }
    
    private List<Cart> itemsWithQuatityList = new ArrayList<Cart>();
}
