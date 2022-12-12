/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.EmpRole.CounsellorRole;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author harsh
 */





public class CounsellorOrganisation extends Organization{
    public CounsellorOrganisation() {
        super(Type.Counsellor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounsellorRole());
        return roles;
    }
}
