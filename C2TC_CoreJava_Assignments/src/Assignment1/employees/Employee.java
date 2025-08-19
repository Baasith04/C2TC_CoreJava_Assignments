package Assignment1.employees;

public class Employee {
 
    private String name;
    private int employeeId;
    private double salary;
    protected String department;
    
    public Employee() {
        this.name = "";
        this.employeeId = 0;
        this.salary = 0.0;
        this.department = "";
    }
    
    public Employee(String name, int employeeId, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
}
