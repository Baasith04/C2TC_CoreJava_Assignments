package Assignment1.utilities;

import Assignment1.employees.Developer;
import Assignment1.employees.Employee;
import Assignment1.employees.Manager;

public class EmployeeUtilities {
    private Employee employees = new Employee; 
    private int employeeCount = 0; 
    private EmployeeUtilities() {
    }
    public static double calculateTotalSalaryExpense() {
        double totalSalary = 0.0;
        for (int i = 0; i < employeeCount; i++) {
            totalSalary += employees[i].getSalary(); 
        return totalSalary;
    }
    
    public static void displayAllEmployees() {
        System.out.println("--- All Employees ---");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(employees[i].toString()); // Using public toString method
        }
    }
    
    public static double calculateAverageSalaryByDepartment(String department) {
        double totalSalary = 0.0;
        int deptEmployeeCount = 0;
        
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getDepartment().equals(department)) {
                totalSalary += employees[i].getSalary();
                deptEmployeeCount++;
            }
        }
        
        return deptEmployeeCount == 0 ? 0.0 : totalSalary / deptEmployeeCount;
    }
    
    static int getManagerCount() {
        int managerCount = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Manager) {
                managerCount++;
            }
        }
        return managerCount;
    }
    
    public static int getDeveloperCount() {
        int developerCount = 0;
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] instanceof Developer) {
                developerCount++;
            }
        }
        return developerCount;
    }
    
    protected static int getEmployeeCount() {
        return employeeCount;
    }
    
    static String generateSystemReport() {
        StringBuilder report = new StringBuilder();
        report.append("Employee System Report\n");
        report.append("======================\n");
        report.append("Total Employees: ").append(employeeCount).append("\n");
        report.append("Total Salary Expense: $").append(String.format("%.2f", calculateTotalSalaryExpense())).append("\n");
        report.append("Managers: ").append(getManagerCount()).append("\n");
        report.append("Developers: ").append(getDeveloperCount()).append("\n");
        report.append("Utility Version: ").append(UTILITY_VERSION).append("\n");
        return report.toString();
    }
}
