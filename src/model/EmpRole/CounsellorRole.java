/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EmpRole;

import model.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.CounsellorRole.CounsellorAdminWorkAreaJPanel;

/**
 *
 * @author karth
 */
public class CounsellorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new CounsellorAdminWorkAreaJPanel( userProcessContainer, business );
    }
    
}
