package Assignment3;

public class Item {
    protected int id;
    protected String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
    }

    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
}