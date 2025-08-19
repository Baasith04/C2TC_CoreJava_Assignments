package Assignment1.employees;

public class Developer extends Employee {
    
    private String programmingLanguage;
    private int yearsOfExperience;
    
    public Developer() {
        super();
        this.programmingLanguage = "";
        this.yearsOfExperience = 0;
    }
    
    public Developer(String name, int employeeId, double salary, String department,
                     String programmingLanguage, int yearsOfExperience) {
        super(name, employeeId, salary, department);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
}
