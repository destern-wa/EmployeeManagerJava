/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagerjava;

import java.util.ArrayList;

/**
 *
 * @author 20023188
 */
public class EmployeeManagerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an employee
        Employee emp1 = new Employee("Winn Dough", 13521);
        System.out.println(emp1.printDetails());
        
        // Modify an employee
        emp1.setName("Winny Dough");
        emp1.setNumber(11);
        System.out.println(emp1.printDetails());
        
        // Create more employees
        Employee emp2 = new Employee("Jane Doe", 21434);
        Employee emp3 = new Employee("Bob Hope", 2534);
        
        // Create a manager
        Manager man1 = new Manager("Martin", 101);
        System.out.println(man1.printDetails());
        
        // Create a manager with employess
        ArrayList<Employee> ItTeam = new ArrayList<Employee>();
        ItTeam.add(emp1);
        ItTeam.add(emp3);
        Manager man2 = new Manager("Marvin", 102, ItTeam);
        System.out.println(man2.printDetails());
        
        // Add employee to a manger
        man1.addEmployee(emp2);
        System.out.println(man1.printDetails());
        
        // Remove an employee from a manager
        man2.removeEmployee(emp3);
        System.out.println(man2.printDetails());
    } 
}
