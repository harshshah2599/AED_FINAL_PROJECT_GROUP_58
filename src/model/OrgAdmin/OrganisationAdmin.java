/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrgAdmin;

import model.EmpRole.OrganizationAdmin;
import model.UserAccount.UserAccount;

/**
 *
 * @author karth
 */
public class OrganisationAdmin extends UserAccount {
    private String name;
    private String address;
    private long mobileNumber;
    public OrganisationAdmin(String name, String userName, String password,int uniqueId) {
        setUsername(userName);
        setPassword(password);
        setUniqueId(uniqueId);
        setRole(new OrganizationAdmin());
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
