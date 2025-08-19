package Assignment1.main;

import Assignment1.employees.Developer;
import Assignment1.employees.Employee;
import Assignment1.employees.Manager;
import Assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    
    public static void main(String[] args) {
        System.out.println("--- Java Packages and Access Modifiers ---\n");
        
        Manager manager1 = new Manager("Mohamed Baasith", 1001, 95000.0, "Engineering", 
                                     8, "Senior");

        Manager manager2 = new Manager("Akshaya", 1002, 88000.0, "Marketing", 
                                     5, "Mid");

        Developer developer1 = new Developer("Devakumaran", 2001, 75000.0, "Engineering", 
                                           "Java", 5);

        Developer developer2 = new Developer("Nivetha", 2002, 72000.0, "Engineering", 
                                           "Python", 3);

        Developer developer3 = new Developer("Kokila", 2003, 80000.0, "Engineering", 
                                           "JavaScript", 7);

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
    }
}

