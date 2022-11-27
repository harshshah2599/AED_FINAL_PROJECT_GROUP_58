/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Employee;

/**
 *
 * @author harsh
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count = 1;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public Employee() {
        id = count;
        count++;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
