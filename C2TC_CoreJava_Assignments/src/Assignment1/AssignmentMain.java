package Assignment1.main;

import Assignment1.employees.Developer;
import Assignment1.employees.Employee;
import Assignment1.employees.Manager;
import Assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    
    public static void main(String[] args) {
        System.out.println("--- Java Packages and Access Modifiers ---\n");
        
        Manager m1 = new Manager("Mohamed Baasith", 1001, 95000.0, "Engineering", 
                                     8, "Senior");

        Manager m2 = new Manager("Akshaya", 1002, 88000.0, "Marketing", 
                                     5, "Mid");

        Developer d1 = new Developer("Devakumaran", 2001, 75000.0, "Engineering", 
                                           "Java", 5);

        Developer d2 = new Developer("Nivetha", 2002, 72000.0, "Engineering", 
                                           "Python", 3);

        Developer d3 = new Developer("Kokila", 2003, 80000.0, "Engineering", 
                                           "JavaScript", 7);

        System.out.println("--- All Managers ---");
        Manager[] mn = EmployeeUtilities.getAllManagers();
        for (int i = 0; i < mn.length; i++) {
            System.out.println(mn[i].toString());
        }
        System.out.println();
        
        System.out.println("--- All Developers ---");
        Developer[] ds = EmployeeUtilities.getAllDevelopers();
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i].toString());
        }
        System.out.println();
    }
}


