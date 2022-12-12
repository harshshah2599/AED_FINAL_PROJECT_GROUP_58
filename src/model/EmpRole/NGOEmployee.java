/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.NGORole.NGOAdminJPanel;
import ui.OrgAdminRole.OrganizationAdminWorkAreaJPanel;

/**
 *
 * @author aditi
 */
public class NGOEmployee extends Role {

    //connecting to the work panel
      public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new NGOAdminJPanel( userProcessContainer, business );
    }
    
}
