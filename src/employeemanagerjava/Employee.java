/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagerjava;
/**
 *
 * @author 20023188
 */
public class Employee {
    protected String name;
    protected int number;
    
    // Constructor
    public Employee(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    
    // Setters
    public void setName(String name) {
        if (name != null && name.isEmpty()) {
            this.name = name;
        }
    }
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        }
    }
    
    public String printDetails() {
        return name + " / " + number;
    }
}
