/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FoodCatering;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */

public class Menu {
     ArrayList<FoodItem> items;
    public  Menu()
    {
        this.items=new ArrayList<>();
    }
    public ArrayList<FoodItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<FoodItem> items) {
        this.items=items;
    }

}
