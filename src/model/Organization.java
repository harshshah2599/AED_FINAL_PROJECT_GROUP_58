/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Employee.EmployeeDirectory;
import model.EmpRole.Role;
import model.UserAccount.UserAccountDirectory;
import model.ServiceQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aditi
 */



public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Receptionist("Receptionist Organization"),
        NGOAdmin("NGO Admin Organization"),
        Doctor("Doctor Organization"),
        Counsellor("Counsellor Organization"),
        College("College Organization"),
        Restaurant("Restaurant Organization"),
        DeliveryMan("Delivery Man Organization");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
        
    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    

    

    @Override
    public String toString() {
        return name;
    }
    
    
}
