package org.example;

// Employee class represents the base class for all types of employees
class Employee {
    private String employeeNo;
    private String employeeName;
    private double basicSalary;

    // Constructor to initialize Employee attributes
    public Employee(String employeeNo, String employeeName, double basicSalary) {
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Getter methods for Employee attributes
    public String getEmployeeNo() {
        return employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Method to calculate bonus for all employees
    public double calBonus() {
        return 0.05 * basicSalary; // default bonus for other employees
    }

    // Method to calculate gross salary for all employees
    public double calGrossSalary() {
        return basicSalary + calBonus();
    }
}

