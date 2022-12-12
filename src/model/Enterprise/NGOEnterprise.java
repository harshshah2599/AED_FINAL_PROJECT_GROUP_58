/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */


public class NGOEnterprise extends Enterprise {

    public NGOEnterprise(String name) {
        super(name,"NGO","");
    }
    public ArrayList<Role> getSupportedRole()
    {
        return  null;
    }
    
}
