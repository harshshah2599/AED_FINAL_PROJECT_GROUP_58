package model;



import model.Employee.Employee;
import model.EmpRole.SystemAdminRole;
import model.UserAccount.UserAccount;



/**
*
* @author harsh
*/
public class ConfigureASystem {

public static EcoSystem configure(){

EcoSystem system = EcoSystem.getInstance();




/*
Create a network for multiple Foster care NGOs 
Create an enterprise for a particular network
Initialize some organizations
Create enterprise admin for each organization
Have some registered persons and create user account
*/


Employee employee = system.getEmployeeDirectory().createEmployee("RRH");

UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole(),123);

return system;
}

}