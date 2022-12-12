/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.DoctorRole;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */


public class DoctorOrganisation extends Organization{
    public DoctorOrganisation() {
        super(Type.Doctor.getValue());
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
    
}
