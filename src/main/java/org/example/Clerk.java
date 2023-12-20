package org.example;

// Clerk class represents another specific type of Employee with additional attributes and functionality
class Clerk extends Employee {
    private String category;

    // Constructor to initialize Clerk attributes
    public Clerk(String employeeNo, String employeeName, double basicSalary, String category) {
        super(employeeNo, employeeName, basicSalary);
        this.category = category;
    }

    // Getter method for Clerk category attribute
    public String getCategory() {
        return category;
    }

    // Override method to calculate bonus for Clerks based on their category
    @Override
    public double calBonus() {
        if ("Grade I".equals(category)) {
            return 0.1 * getBasicSalary(); // bonus for Grade I clerks
        } else {
            return 0.05 * getBasicSalary(); // bonus for Grade II clerks
        }
    }
}
