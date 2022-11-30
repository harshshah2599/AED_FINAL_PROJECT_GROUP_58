/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author aditi
 */


public class OrganizationDirectory {
    ArrayList<Organization> organisationList;

    
    
    public OrganizationDirectory() {
        organisationList=new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganisationList() {
        return organisationList;
    }


    
    
    public Organization createOrganisation(Organization organization)
    {
        if(organisationList==null)
        {
             organisationList=new ArrayList<Organization>();
        }
        organisationList.add(organization);
        return organization;
    }
    
    
}
