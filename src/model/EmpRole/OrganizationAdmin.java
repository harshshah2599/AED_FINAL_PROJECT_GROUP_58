/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.OrgAdminRole.OrganizationAdminWorkAreaJPanel;

/**
 *
 * @author harsh
 */
public class OrganizationAdmin extends Role {
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new OrganizationAdminWorkAreaJPanel( userProcessContainer, business );
        //returns to organisation admin work area panel
    }
}
