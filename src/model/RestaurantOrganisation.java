/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.RestaurantAdmin;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */

// getvalue() function is invoved from the super class of Organization in the class of RestaurantOrganization

public class RestaurantOrganisation extends Organization{
    public RestaurantOrganisation() {
        super(Type.Restaurant.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        // a new array list will store the details of restaurant admin 
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantAdmin());
        return roles;
    }
    
}
