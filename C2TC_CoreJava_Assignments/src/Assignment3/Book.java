package Assignment3;

public class Book extends Item {
    private String author;
   
    public Book(int id, String title, String author) {
        super(id, title); // Call parent constructor
        this.author = author;
    }
    
    public void displayInfo() {
        System.out.println("BOOK ");
        super.displayInfo(); // Call parent's displayInfo
        System.out.println("Author: " + author);
        System.out.println();
    }
    
    // Getter for author
    public String getAuthor() {
        return author;
    }

}
