/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author karth
 */
public abstract class Role {

    public enum RoleType{
        Customer("Customer"),
        DeliveryMan("Delivery Role"),
        OrganizationAdmin("OrganizationAdmin Role"),
        SysAdmin("Sysadmin"),
        Receptionist("Receptionist Role"),
        NGOEmployee("NGO Employee Role"),
        Doctor("Doctor Role"),
        Counsellor("Counsellor Role"),
        College("College Role"),
        RestaurantAdmin("Restaurant Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);
    
}