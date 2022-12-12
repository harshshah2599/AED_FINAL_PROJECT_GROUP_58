/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

import java.util.ArrayList;

/**
 *
 * @author harsh
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }
    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}