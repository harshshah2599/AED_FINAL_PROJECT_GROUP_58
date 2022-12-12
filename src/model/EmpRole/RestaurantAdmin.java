/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;

import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.RestaurantAdminRole.RestaurantWorkAreaJPanel;

/**
 *
 * @author karth
 */
public class RestaurantAdmin extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new RestaurantWorkAreaJPanel(userProcessContainer,business);
    }

    
    
}
