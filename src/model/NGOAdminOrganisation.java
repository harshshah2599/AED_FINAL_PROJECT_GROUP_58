/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.NGOEmployee;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */


public class NGOAdminOrganisation extends Organization{
    public NGOAdminOrganisation() {
        super(Type.NGOAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOEmployee());
        return roles;
    }
    
    
}
