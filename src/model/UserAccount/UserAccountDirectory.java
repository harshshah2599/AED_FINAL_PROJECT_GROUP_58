/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.NetworkLink.Network;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role,int uniqueId){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setUniqueId(uniqueId);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username,EcoSystem system){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
            {
                return false;
            }
            for (Network networks :system.getNetworks() ) {
                for (Enterprise enterprises : networks.getEnterpriseDirectory().getEnterprises()) {
                    for (UserAccount userAccount : enterprises.getUserAccountDirectory().getUserAccountList()) {
                        if (userAccount.getUsername().equals(username)) {
                            return false;
                        }
//                        for (Organization org : enterprises.getOrganizationDirectory().g()) {
//                            for (UserAccount accOrg : org.getUserAccountDirectory().getUserAccountList()) {
//                                //                 System.out.println("Organization-->" + accOrg.getUsername());
//                                if (accOrg.getUname().equals(username)) {
//                                    return false;
//                                }
//                            }
//
//                        }
                    }

                }
            }
            
        }
        return true;
    }
    public UserAccount addUserAccountToAccounts(UserAccount userAccount){
        userAccountList.add(userAccount);
        return userAccount;
    }
}
