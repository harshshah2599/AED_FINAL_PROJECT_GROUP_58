/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.ReceptionistRole;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */


public class ReceptionistOrganisation extends Organization {

    public ReceptionistOrganisation() {
        super(Type.Receptionist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ReceptionistRole());
        return roles;
    }
    
}
