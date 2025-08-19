package Assignment1.employees;

public class Manager extends Employee {
    
    private int teamSize;
    private String managementLevel;
 
    public Manager(String name, int employeeId, double salary, String department, 
                   int teamSize, String managementLevel) {
    	super(name, employeeId, salary, department);
    	this.teamSize = teamSize;
        this.managementLevel = managementLevel;
    }
    
    public int getTeamSize() {
        return teamSize;
    }
    
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    
    public String getManagementLevel() {
        return managementLevel;
    }
    
    public void setManagementLevel(String managementLevel) {
        this.managementLevel = managementLevel;
    }
    }
}
