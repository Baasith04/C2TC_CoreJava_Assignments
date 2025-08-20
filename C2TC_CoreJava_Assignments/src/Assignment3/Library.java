package Assignment3;

// Library class that has-a array of Item objects
public class Library {
    private Item[] items; // Library has-a array of Items
    private String libraryName;
    private int itemCount; // Keep track of number of items
    private int maxCapacity; // Maximum capacity of the library
    
    // Constructor
    public Library(String libraryName, int maxCapacity) {
        this.libraryName = libraryName;
        this.maxCapacity = maxCapacity;
        this.items = new Item[maxCapacity]; // Initialize array
        this.itemCount = 0;
    }
    
    // Default constructor with capacity of 100
    public Library(String libraryName) {
        this(libraryName, 100);
    }
    
    // Method to add an item to the library
    public void addItem(Item item) {
        if (itemCount < maxCapacity) {
            items[itemCount] = item;
            itemCount++;
            System.out.println("Added item: " + item.getTitle() + " (ID: " + item.getId() + ")");
        } else {
            System.out.println("Cannot add item. Library is at maximum capacity (" + maxCapacity + ").");
        }
    }
    
    // Method to show all items in the library
    public void showAllItems() {
        System.out.println("\n========================================");
        System.out.println("LIBRARY: " + libraryName);
        System.out.println("Total Items: " + itemCount + "/" + maxCapacity);
        System.out.println("========================================");
        
        if (itemCount == 0) {
            System.out.println("No items in the library.");
        } else {
            for (int i = 0; i < itemCount; i++) {
                items[i].displayInfo(); // Polymorphism in action
            }
        }
    }
    
    // Additional utility methods
    public int getTotalItems() {
        return itemCount;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
    public boolean isFull() {
        return itemCount == maxCapacity;
    }
}