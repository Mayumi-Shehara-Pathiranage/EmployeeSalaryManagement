package org.example;

// Manager class represents a specific type of Employee with additional functionality
class Manager extends Employee {
    // Constructor to initialize Manager attributes
    public Manager(String employeeNo, String employeeName, double basicSalary) {
        super(employeeNo, employeeName, basicSalary);
    }

    // Override method to calculate bonus for Managers
    @Override
    public double calBonus() {
        return 0.2 * getBasicSalary(); // bonus for managers
    }

    // Method to calculate tax for Managers
    public double calTax() {
        return 0.15 * getBasicSalary(); // tax for managers
    }

    // Override method to calculate gross salary for Managers including bonus and tax
    @Override
    public double calGrossSalary() {
        return getBasicSalary() + calBonus() - calTax();
    }
}
