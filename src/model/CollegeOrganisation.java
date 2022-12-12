/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.Role;
import model.EmpRole.College;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class CollegeOrganisation extends Organization{
    public CollegeOrganisation() {
        super(Type.College.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList();
        
        roles.add(new model.EmpRole.College());
        
        return roles;
    }
}
