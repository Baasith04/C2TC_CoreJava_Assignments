package Assignment3;

public class Library {
    private Item[] items; 
    private String libraryName;
    private int itemCount; 
    private int maxCapacity; 

    public Library(String libraryName, int maxCapacity) {
        this.libraryName = libraryName;
        this.maxCapacity = maxCapacity;
        this.items = new Item[maxCapacity]; 
        this.itemCount = 0;
    }

    public Library(String libraryName) {
        this(libraryName, 100);
    }
 
    public void addItem(Item item) {
        if (itemCount < maxCapacity) {
            items[itemCount] = item;
            itemCount++;
            System.out.println("Added item: " + item.getTitle() + " (ID: " + item.getId() + ")");
        } else {
            System.out.println("Cannot add item. Library is at maximum capacity (" + maxCapacity + ").");
        }
    }
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
