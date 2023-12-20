package org.example;

// Company class is the main class to test the Employee hierarchy
public class Company {
    public static void main(String[] args) {
        // Creating instances of different employee types
        Manager manager = new Manager("M0001", "Mayumi", 60000);
        Clerk clerk = new Clerk("C0010", "Amasha", 70000, "Grade I");
        Employee otherEmployee = new Employee("E0013", "Shehara", 40000);

        // Displaying the gross salary for each employee type
        System.out.println("Manager's Gross Salary: " + manager.calGrossSalary());
        System.out.println("Clerk's Gross Salary: " + clerk.calGrossSalary());
        System.out.println("Other Employee's Gross Salary: " + otherEmployee.calGrossSalary());
    }
}
