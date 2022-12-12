/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Organization;
import model.OrganizationDirectory;
import model.FoodCatering.Restaurant;
import model.EmpRole.Role;
import java.util.ArrayList;

/**
 *
 * @author karth
 */
public class Enterprise extends Organization {

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public Enterprise(String name,String type,String collegeType) {
        super(name);
        this.enterpriseType=type;
        this.collegeType=collegeType;
        this.organizationDirectory=new OrganizationDirectory();
    }
    
    private  String enterpriseType; 
    private  String  collegeType;
    private  Restaurant restaurant;

    public Restaurant getRestaurant() {
        if(restaurant==null)
        {
            restaurant=new  Restaurant();
        }
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getCollegeType() {
        return collegeType;
    }

    public void setCollegeType(String collegeType) {
        this.collegeType = collegeType;
    }
    private  OrganizationDirectory organizationDirectory;
    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum EnterpriseType{
        NGO("NGO"),
        Restaurant("Restaurant"),
        College("College"),
        CollegeCounsellor("CollegeCounsellor"),
        Hospital("Hospital");
        private String value;
        private EnterpriseType(String value){
        this.value=value;
        }
        public String getValue() {
        return value;
        }
        @Override
        public String toString(){
        return value;
        }
    }
}
