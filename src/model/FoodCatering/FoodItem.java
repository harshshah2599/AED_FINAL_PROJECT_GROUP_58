/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.FoodCatering;

/**
 *
 * @author aditi
 */
public class FoodItem {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String inStock;

    

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
    
    public String isInStock() {
        return inStock;
    }
    
}
