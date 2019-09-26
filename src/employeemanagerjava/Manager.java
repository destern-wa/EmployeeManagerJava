package employeemanagerjava;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20023188
 */
public class Manager extends Employee {
    private ArrayList<Employee> employees;
    
    // Constructors
    public Manager(String name, int number) {
        super(name, number);
    }
    public Manager(String name, int number, ArrayList<Employee> employees) {
        super(name, number);
        this.employees = employees;
    }    
    
    // Getters
    public ArrayList<Employee> getEmployess() {
        return employees;
    }
    
    // Setters
    public void addEmployee(Employee newEmployee) {
        if (newEmployee != null) {
            employees.add(newEmployee);
        }
    }
    public void removeEmployee(Employee newEmployee) {
        employees.remove(newEmployee);
    }
    
    @Override
    public String printDetails() {
        String managerDetails = "Manager " + name + " / " + number + "/n";
        if (employees.isEmpty()) {
            return managerDetails + "(no employess)";
        }
        managerDetails += "Employees:";
        for (Employee employee : employees) {
            managerDetails += "\n- " + employee.printDetails();
        }
        return managerDetails;
    }
}
