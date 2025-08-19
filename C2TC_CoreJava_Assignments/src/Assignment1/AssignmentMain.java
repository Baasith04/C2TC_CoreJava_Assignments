package Assignment1.main;

import Assignment1.employees.Developer;
import Assignment1.employees.Employee;
import Assignment1.employees.Manager;
import Assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    
    public static void main(String[] args) {
        System.out.println("--- Java Packages and Access Modifiers ---\n");
        
        Manager manager1 = new Manager("Mohamed Baasith", 1001, 95000.0, "Engineering", 
                                     8, "Senior", "Annual budget of $2M");

        Manager manager2 = new Manager("Akshaya", 1002, 88000.0, "Marketing", 
                                     5, "Mid", "Quarterly budget of $500K");

        Developer developer1 = new Developer("Devakumaran", 2001, 75000.0, "Engineering", 
                                           "Java", 5, "E-commerce Platform");

        Developer developer2 = new Developer("Nivetha", 2002, 72000.0, "Engineering", 
                                           "Python", 3, "Data Analytics System");

        Developer developer3 = new Developer("Kokila", 2003, 80000.0, "Engineering", 
                                           "JavaScript", 7, "Frontend Redesign");

        
        
        System.out.println("Adding employees to the system...");
        EmployeeUtilities.addEmployee(manager1);
        EmployeeUtilities.addEmployee(manager2);
        EmployeeUtilities.addEmployee(developer1);
        EmployeeUtilities.addEmployee(developer2);
        EmployeeUtilities.addEmployee(developer3);
        System.out.println("All employees added successfully!\n");
        
        EmployeeUtilities.displayAllEmployees();
        System.out.println();
        System.out.println("Manager 1 Name: " + manager1.getName()); 
        System.out.println("Developer 1 Programming Language: " + developer1.getProgrammingLanguage());
        System.out.println();
        
        System.out.printf("Total Salary Expense: $%.2f%n", 
                         EmployeeUtilities.calculateTotalSalaryExpense());
        
        System.out.printf("Average Engineering Department Salary: $%.2f%n", 
                         EmployeeUtilities.calculateAverageSalaryByDepartment("Engineering"));
        
        System.out.printf("Average Marketing Department Salary: $%.2f%n", 
                         EmployeeUtilities.calculateAverageSalaryByDepartment("Marketing"));
        System.out.println();
   
        Employee foundEmployee = EmployeeUtilities.findEmployeeById(2001);
        if (foundEmployee != null) {
            System.out.println("Found: " + foundEmployee.toString());
        }
        System.out.println();
        
        
        System.out.println("--- All Managers ---");
        Manager[] managers = EmployeeUtilities.getAllManagers();
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i].toString());
        }
        System.out.println();
        
        System.out.println("--- All Developers ---");
        Developer[] developers = EmployeeUtilities.getAllDevelopers();
        for (int i = 0; i < developers.length; i++) {
            System.out.println(developers[i].toString());
        }
        System.out.println();
        
        
        System.out.println("\n--- Program Completed Successfully ---");
    }
}
