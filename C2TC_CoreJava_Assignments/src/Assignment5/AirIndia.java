package Assignment5;

public class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public AirIndia() {}

    // Parameterized constructor
    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() { 
    	return hours; 
    }
    
    public void setHours(int hours) { 
    	this.hours = hours; 
    }

    public double getCostPerHour() { 
    	return costPerHour; 
    }
    
    public void setCostPerHour(double costPerHour) { 
    	this.costPerHour = costPerHour; 
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("Total Amount is %.2f\n", calculateAmount());
    }
    
}
