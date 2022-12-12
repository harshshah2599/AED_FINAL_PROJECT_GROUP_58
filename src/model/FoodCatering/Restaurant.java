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
public class Restaurant {
    private String name;
    private int restaurantId;
    private Menu menu;

    public int getRestaurantId()
    {
        return restaurantId;
    }
    public void setRestaurantId(int restaurantId) {
            this.restaurantId = restaurantId;
        }
    public Restaurant(){
    
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Menu getMenu() {
        if(menu==null)
        {
            menu=new Menu();
        }
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    @Override
    public String toString() {
        return this.name;
    }

    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
