/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.OrgAdmin;

import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class OrganisationAdminDirectory {
    ArrayList<OrganisationAdmin> organisationAdmins;
    public  OrganisationAdminDirectory()
    {
        this.organisationAdmins=new ArrayList<>();
    }

    public ArrayList<OrganisationAdmin> getOrganisationAdmins() {
        return organisationAdmins;
    }

    public void setOrganisationAdmins(OrganisationAdmin organisationAdmins) {
        this.organisationAdmins.add(organisationAdmins);
    }
   
}
