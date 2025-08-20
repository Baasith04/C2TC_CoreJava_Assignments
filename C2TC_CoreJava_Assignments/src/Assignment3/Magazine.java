package Assignment3;

// Subclass Magazine (Magazine is-a Item)
public class Magazine extends Item {
    private int issueNumber;
    
    // Constructor
    public Magazine(int id, String title, int issueNumber) {
        super(id, title); // Call parent constructor
        this.issueNumber = issueNumber;
    }
    
    // Override displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("=== MAGAZINE ===");
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Issue Number: " + issueNumber);
        System.out.println();
    }
    
    // Getter for issue number
    public int getIssueNumber() {
        return issueNumber;
    }
}