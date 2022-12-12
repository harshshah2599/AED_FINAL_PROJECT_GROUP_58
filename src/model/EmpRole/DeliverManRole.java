/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.DeliveryRole.DeliveryManWorkAreaJPanel;

/**
 *
 * @author aditi
 */
public class DeliverManRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new DeliveryManWorkAreaJPanel(business);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
